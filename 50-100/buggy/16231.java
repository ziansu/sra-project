public void showLoadingScreen() {
    java.lang.System.out.println("Attempting to show the loading screen");
    if ((loadingScreenImage) != null) {
        java.lang.System.out.println("Attempting to show the loading screen 02");
        if ((currentPanel) != null) {
            java.lang.System.out.println("Attempting to show the loading screen 03");
            java.awt.Component[] comps = currentPanel.getComponents();
            for (java.awt.Component c : comps) {
                c.setVisible(false);
            }
        }
        java.lang.System.out.println("Showing loading screen");
        loadingScreenImage.setVisible(true);
    }
}