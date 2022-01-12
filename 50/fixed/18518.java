@java.lang.Override
public org.firstinspires.ftc.griffins.MenuPort.HalDashboard getHalDashboard() {
    if ((halDashboard) == null) {
        halDashboard = new org.firstinspires.ftc.griffins.MenuPort.HalDashboard(telemetry);
    }
    halDashboard.resetTelemetryForHalDashboard();
    return halDashboard;
}