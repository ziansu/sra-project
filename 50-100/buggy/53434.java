@java.lang.Override
public void robotInit() {
    org.usfirst.frc.team2353.robot.Robot.oi = new org.usfirst.frc.team2353.robot.OI();
    org.usfirst.frc.team2353.robot.Robot.chassis = new org.usfirst.frc.team2353.robot.subsystems.Chassis();
    org.usfirst.frc.team2353.robot.Robot.winch = new org.usfirst.frc.team2353.robot.subsystems.Winch();
    org.usfirst.frc.team2353.robot.Robot.tray = new org.usfirst.frc.team2353.robot.subsystems.Tray();
    modeChooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    modeChooser.addDefault("Move Forward", "forward");
    modeChooser.addDefault("Do Nothing", "nothing");
    modeChooser.addObject("Gear", "gear");
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto mode", modeChooser);
}