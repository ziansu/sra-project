private org.apache.nifi.components.state.StateMap getState(final java.lang.String componentId, final org.apache.nifi.components.state.Scope scope) {
    try {
        final org.apache.nifi.components.state.StateManager manager = stateManagerProvider.getStateManager(componentId);
        if (manager == null) {
            throw new org.apache.nifi.web.ResourceNotFoundException(java.lang.String.format("State for the specified component %s could not be found.", componentId));
        }
        return manager.getState(scope);
    } catch (final java.io.IOException ioe) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Unable to get the state for the specified component %s: %s", componentId, ioe));
    }
}