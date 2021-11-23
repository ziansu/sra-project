public void changeScene(javax.swing.JPanel scene) {
    motion.stopAllTimers();
    removeKeyFocus();
    motion = null;
    play = null;
    keyboardFocus = null;
    keyEventDispatcher = null;
    snake.App.getInstance().runScene(scene);
}