public void run() {
    java.awt.Dimension screen = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    java.awt.Dimension window = getSize();
    int iCenterX = (screen.width) / 2;
    int iCenterY = (screen.height) / 2;
    setLocation((iCenterX - ((window.width) / 2)), (iCenterY - ((window.height) / 2)));
    revalidate();
    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
}