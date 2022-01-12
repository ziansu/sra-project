private void disable() {
    resetSearch();
    if ((currentSelection) != null) {
        scrollManager.scrollDown();
    }
    currentSelection = null;
    currentUser = null;
    if ((shouldReturnFocusTo) != null) {
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                shouldReturnFocusTo.requestFocusInWindow();
            }
        });
    }
}