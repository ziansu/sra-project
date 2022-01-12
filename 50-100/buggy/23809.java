public void enable() {
    org.usfirst.frc.team467.robot.Autonomous.ActionGroup.LOGGER.debug("Resetting Process");
    for (org.usfirst.frc.team467.robot.Autonomous.Action act : master) {
        if ((act.condition) == ((org.usfirst.frc.team467.robot.Autonomous.ActionGroup.Duration) (act.condition))) {
            org.usfirst.frc.team467.robot.Autonomous.ActionGroup.LOGGER.debug("Resetting Duration");
            ((org.usfirst.frc.team467.robot.Autonomous.ActionGroup.Duration) (act.condition)).reset();
        }
    }
    agenda = new java.util.LinkedList(master);
    action = null;
}