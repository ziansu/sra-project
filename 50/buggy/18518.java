@java.lang.Override
public org.firstinspires.ftc.griffins.MenuPort.HalDashboard getHalDashboard() {
    halDashboard = new org.firstinspires.ftc.griffins.MenuPort.HalDashboard(telemetry);
    halDashboard.resetTelemetryForHalDashboard();
    return halDashboard;
}