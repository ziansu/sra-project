private void formWindowClosing(java.awt.event.WindowEvent evt) {
    visualPanel1.animator.stopAnimation();
    if ((matchMode) != (Enums.GameModes.MULTIPLAYER_CLIENT)) {
        intelligenceControlThread.stopNicely();
    }
    Visual.VisualEngine.instance = null;
}