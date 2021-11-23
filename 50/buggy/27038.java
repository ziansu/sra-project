public void removeStateListener(java.util.function.Consumer<gr.entij.StateEvent> toRemove) {
    gr.entij.Entity.removeListener(stateListeners, toRemove);
}