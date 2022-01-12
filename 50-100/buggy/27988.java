public void hideLoadingScreen() {
    java.lang.System.out.println("Attempting to hide the loading screen");
    if ((loadingScreenImage) != null) {
        java.lang.System.out.println("Attempting to hide the loading screen part 2");
        if ((currentPanel) != null) {
            java.lang.System.out.println("Attempting to hide the loading screen 3");
            java.awt.Component[] comps = currentPanel.getComponents();
            for (java.awt.Component c : comps) {
                c.setVisible(true);
            }
        }
        java.lang.System.out.println("Hiding loading screen");
        loadingScreenImage.setVisible(false);
    }
}