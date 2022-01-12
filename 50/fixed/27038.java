public void removeStateListener(java.util.function.Consumer<gr.entij.StateEvent> toRemove) {
    stateListeners = gr.entij.Entity.removeListener(stateListeners, toRemove);
}