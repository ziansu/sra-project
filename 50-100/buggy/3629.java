private Camera.Target getTarget() {
    org.usfirst.frc.team2557.robot.subsystems.Camera[] targets = Robot.camera.getTargets();
    org.usfirst.frc.team2557.robot.subsystems.Camera.Target trackedTarget = null;
    for (org.usfirst.frc.team2557.robot.subsystems.Camera.Target target : targets) {
        if (trackedTarget != null) {
            if ((trackedTarget.width) < (target.width)) {
                trackedTarget = target;
            }
        }else {
            trackedTarget = target;
        }
    }
    return trackedTarget;
}