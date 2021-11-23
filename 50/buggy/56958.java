public void run() {
    try {
        window = new edu.cmu.lti.bic.sbs.ui.MainWindow(ui);
        edu.cmu.lti.bic.sbs.ui.Sound.play("1");
        window.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}