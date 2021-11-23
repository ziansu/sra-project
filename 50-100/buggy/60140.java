@java.lang.Override
public void removeState(final java.lang.String stateId) {
    if (stateId == null) {
        throw new java.lang.NullPointerException("Cannot remove a null state");
    }
    final org.eclipse.core.commands.State state = states.get(stateId);
    if (state != null) {
        state.removeListener(this);
        if ((states) != null) {
            states.remove(state);
            if (states.isEmpty()) {
                states = null;
            }
        }
    }
}