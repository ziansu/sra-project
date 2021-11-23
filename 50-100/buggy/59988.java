@java.lang.Override
public void init() {
    motor = new sics.port.PluginPPort(this, "motor");
    subDist = new sics.port.PluginRPort(this, "subDist");
    mqtt = new sics.port.PluginPPort(this, "mqtt");
    pidController = new plugins.PIDController(plugins.AdaptiveCruiseControl.TARGET_DISTANCE, 0);
    pidController.setPIDParam(plugins.PIDController.PID_KP, plugins.AdaptiveCruiseControl.PROPORTIONAL_TERM);
    pidController.setPIDParam(plugins.PIDController.PID_KI, plugins.AdaptiveCruiseControl.INTEGRAL_TERM);
    pidController.setPIDParam(plugins.PIDController.PID_KD, plugins.AdaptiveCruiseControl.DERIVATIVE_TERM);
    zeroUsedPrev = False;
}