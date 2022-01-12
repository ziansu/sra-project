private void action() {
    try {
        java.lang.Thread.sleep(66);
        frame.repaint();
        main.java.org.usfirst.frc.team5431.SmarterDashboard.table.putString("AUTO-SELECTED", ((java.lang.String) (autochooser.getSelectedItem())));
        main.java.org.usfirst.frc.team5431.SmarterDashboard.table.putNumber("STATION", ((int) (stationchooser.getValue())));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}