private void clearState(final java.lang.String componentId) {
    try {
        final org.apache.nifi.components.state.StateManager manager = stateManagerProvider.getStateManager(componentId);
        if (manager == null) {
            throw new org.apache.nifi.web.ResourceNotFoundException(java.lang.String.format("State for the specified component %s could not be found.", componentId));
        }
        manager.clear(Scope.CLUSTER);
        manager.clear(Scope.LOCAL);
    } catch (final java.io.IOException ioe) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Unable to clear the state for the specified component %s: %s", componentId, ioe), ioe);
    }
}