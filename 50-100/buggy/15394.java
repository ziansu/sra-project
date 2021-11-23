public void post(org.usfirst.frc.team4141.MDRobotBase.notifications.RobotNotification notification) {
    if (((getSubsystems()) != null) && (getSubsystems().containsKey("WebSockets"))) {
        ((org.usfirst.frc.team4141.robot.subsystems.WebSocketSubsystem) (getSubsystems().get("WebSockets"))).post(null, notification);
    }
}