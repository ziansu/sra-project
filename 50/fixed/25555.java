public void removeAddRemoveListener(java.util.function.Consumer<? super gr.entij.EntityEvent> toRemove) {
    addRemoveListeners = removeListener(addRemoveListeners, toRemove);
}