public static double inputControlY(double axis) {
    double output = 0.0;
    if (axis > (com.team1757.robot.OI.DEADBAND)) {
        output = ((java.lang.Math.pow(axis, 3)) * (com.team1757.robot.OI.GAIN)) + (com.team1757.robot.OI.DEADBAND);
    }else
        if (axis < (-(com.team1757.robot.OI.DEADBAND))) {
            axis = -axis;
            output = (-((java.lang.Math.pow(axis, 3)) * (com.team1757.robot.OI.GAIN))) - (com.team1757.robot.OI.DEADBAND);
        }else {
            output = 0.0;
        }
    
    return output;
}