public void init() {
    try {
        new java.lang.ProcessBuilder(org.usfirst.frc.team95.robot.VisionHandler.CLEAR_TMP_CMD).inheritIO().start();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e);
    }
    time.reset();
    time.start();
    GRIPTable = edu.wpi.first.wpilibj.networktables.NetworkTable.getTable("GRIP/myLinesReport");
    GRIPTable.addTableListener(updater);
    new java.lang.Thread(crashCheck).start();
}