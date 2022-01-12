public void run() {
    try {
        domain.User.Role role = gui.MainWindow.getWindowRole();
        if (role != null) {
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setVisible(true);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}