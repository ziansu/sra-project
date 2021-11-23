public void run() {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        ui.GUI window = new ui.GUI();
        window.frmCardsAgainstHumanity.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}