public static double[] getAxisValue() {
    org.usfirst.frc.team3243.robot.InputManager.axis[0] = org.usfirst.frc.team3243.robot.InputManager.ps2controller.getRawAxis(2);
    org.usfirst.frc.team3243.robot.InputManager.axis[1] = org.usfirst.frc.team3243.robot.InputManager.ps2controller.getRawAxis(1);
    org.usfirst.frc.team3243.robot.InputManager.axis[2] = org.usfirst.frc.team3243.robot.InputManager.ps2controller.getRawAxis(3);
    org.usfirst.frc.team3243.robot.InputManager.axis = org.usfirst.frc.team3243.robot.InputManager.deadZone(org.usfirst.frc.team3243.robot.InputManager.axis);
    return org.usfirst.frc.team3243.robot.InputManager.axis;
}