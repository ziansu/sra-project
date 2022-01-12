private void stopShortcuts() {
    final screenstudio.gui.Main instance = this;
    new java.lang.Thread(() -> {
        try {
            if ((keyShortcuts) != null) {
                keyShortcuts.reset();
                keyShortcuts.stop();
            }
        } catch (java.lang.Exception ex) {
            keyShortcuts = null;
        }
    }).start();
}