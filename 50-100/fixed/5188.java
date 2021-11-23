public void run() {
    try {
        domain.User.Role role = gui.MainWindow.getWindowRole();
        if (role != null) {
            gui.MainWindow frame = new gui.MainWindow(role);
            frame.setVisible(true);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}