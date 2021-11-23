@java.lang.Override
public void teleopInit() {
    teleopRunner = new com.saintsrobotics.corebot.coroutine.TaskRunner(new com.saintsrobotics.corebot.tasks.teleop.ArcadeDriveTask(), new com.saintsrobotics.corebot.tasks.teleop.LifterTask(), new com.saintsrobotics.corebot.tasks.teleop.ShifterTask(), new com.saintsrobotics.corebot.tasks.teleop.GearDropperTask(), new com.saintsrobotics.corebot.tasks.UpdateMotors());
}