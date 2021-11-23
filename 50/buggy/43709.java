public static void initialize(com.qualcomm.robotcore.hardware.HardwareMap hardwareMap) {
    org.firstinspires.ftc.team3525.ScienceFairRobot.leftMotor = hardwareMap.dcMotor.get("left motor");
    org.firstinspires.ftc.team3525.ScienceFairRobot.rightMotor = hardwareMap.dcMotor.get("right motor");
    org.firstinspires.ftc.team3525.ScienceFairRobot.sawMotor = hardwareMap.dcMotor.get("saw motor");
    org.firstinspires.ftc.team3525.ScienceFairRobot.shooterMotor = hardwareMap.dcMotor.get("shooter motor");
}