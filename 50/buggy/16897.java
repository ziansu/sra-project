@java.lang.Override
public void onActivityActivate() {
    getLog().info("Activity is.erle.captain activate");
    sendCommand(is.erle.captain.IsErleCaptainActivity.CommandOptions.WRITE_MISSION);
}