public void removeMoveListener(java.util.function.Consumer<? super gr.entij.MoveEvent> toRemove) {
    moveListeners = gr.entij.Entity.removeListener(moveListeners, toRemove);
}