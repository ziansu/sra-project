public void drive(double rotation, org.usfirst.frc.team1014.robot.utils.Vector2d translation) {
    double robotAngle = java.lang.Math.toRadians(imu.getYaw());
    java.lang.System.out.println(("ANGLE: " + robotAngle));
    java.lang.System.out.println(("IN: " + translation));
    wheelA.drive(translation, normalizer);
    wheelB.drive(translation, normalizer);
    wheelC.drive(translation, normalizer);
    wheelD.drive(translation, normalizer);
    normalizer.run();
    normalizer.clear();
}