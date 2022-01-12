public void showLoadingScreen() {
    if ((loadingScreenImage) != null) {
        if ((currentPanel) != null) {
            java.awt.Component[] comps = currentPanel.getComponents();
            for (java.awt.Component c : comps) {
            }
        }
        loadingScreenImage.setVisible(true);
    }
}