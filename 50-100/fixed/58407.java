public static double deadzone(double amount, double max) {
    amount = -((java.lang.Math.abs(amount)) <= (org.usfirst.frc.team2335.robot.Robot.DEADZONE) ? 0 : (amount = (amount < 0) ? amount : amount));
    return ((max - 0) / ((1 - (org.usfirst.frc.team2335.robot.Robot.DEADZONE)) - 0)) * (amount - 0);
}