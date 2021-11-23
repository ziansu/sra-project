public void drive(double rotation, org.usfirst.frc.team1014.robot.utils.Vector2d translation) {
    double robotAngle = java.lang.Math.toRadians(imu.getYaw());
    java.lang.System.out.println(("ANGLE: " + robotAngle));
    java.lang.System.out.println(("IN: " + translation));
    wheelA.drive(translation, rotation, normalizer);
    wheelB.drive(translation, rotation, normalizer);
    wheelC.drive(translation, rotation, normalizer);
    wheelD.drive(translation, rotation, normalizer);
    normalizer.run();
    normalizer.clear();
}