@java.lang.Override
public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    modules.forEach(Module::teleopPeriodicModule);
    displayNumbers();
}