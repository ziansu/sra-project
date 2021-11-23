@java.lang.Override
public final void autonomousPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    org.usfirst.frc4904.standard.LogKitten.wtf(((autonomousCommand.isRunning()) + ""));
    autonomousExecute();
    alwaysExecute();
}