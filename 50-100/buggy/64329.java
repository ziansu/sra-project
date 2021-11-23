public static void main(java.lang.String[] args) {
    java.lang.String det = "PCAL";
    org.clas.fcmon.ec.ECMon monitor = new org.clas.fcmon.ec.ECMon(det);
    org.clas.fcmon.ec.ECMon.app.setPluginClass(monitor);
    org.clas.fcmon.ec.ECMon.app.makeGUI();
    org.clas.fcmon.ec.ECMon.app.mode7Emulation.init("/daq/fadc/ec", 1, 3, 1);
    monitor.makeApps();
    monitor.addCanvas();
    monitor.init();
    monitor.initDetector();
    org.clas.fcmon.ec.ECMon.app.init();
    monitor.ecDet.initButtons();
}