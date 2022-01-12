private void stopShortcuts() {
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