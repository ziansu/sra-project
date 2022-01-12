private void formWindowOpened(java.awt.event.WindowEvent evt) {
    if (((matchMode) == (Enums.GameModes.SINGLEPLAYER)) || ((matchMode) == (Enums.GameModes.MULTIPLAYER_HOST))) {
        if ((sursePrimite) != null) {
            intelligenceControlThread = new Engine.IntelligenceControlThread(sursePrimite);
            intelligenceControlThread.start();
            visualPanel1.animator.start();
        }
    }
}