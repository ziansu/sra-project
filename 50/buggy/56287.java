@java.lang.Override
public void toggleMenuState() {
    if (isRunning) {
        java.lang.System.out.println("test");
        draw();
        menuPanel.setVisible(true);
        menuPanel.requestFocus();
        menuPanel.repaint();
    }
}