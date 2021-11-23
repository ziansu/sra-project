public void changeScene(javax.swing.JPanel scene) {
    removeKeyFocus();
    motion.stopAllTimers();
    motion = null;
    play = null;
    keyboardFocus = null;
    keyEventDispatcher = null;
    snake.App.getInstance().runScene(scene);
}