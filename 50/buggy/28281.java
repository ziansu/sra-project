@java.lang.Override
public void init() {
    try {
        fwd = new com.qualcomm.ftcrobotcontroller.opmodes.FWD();
        telemetry.addData("GGWP", "fwd created");
    } catch (java.lang.Exception e) {
    }
}