public void run() {
    try {
        ui.GUI window = new ui.GUI();
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        window.frmCardsAgainstHumanity.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}