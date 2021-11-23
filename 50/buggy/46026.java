public static void main(java.lang.String[] args) throws java.io.IOException {
    new java.lang.Thread(new logic.FtpClient()).start();
    gui.MainFrame mainFrame = new gui.MainFrame();
    mainFrame.setVisible(true);
}