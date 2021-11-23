public void removeAddRemoveListener(java.util.function.Consumer<? super gr.entij.EntityEvent> toRemove) {
    removeListener(addRemoveListeners, toRemove);
}