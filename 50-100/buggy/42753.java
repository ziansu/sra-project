public static control.Trajectory4d newConstantYawCircleTrajectory4D(applications.trajectory.Point4D origin, double radius, double frequency, double planeAngle) {
    return applications.trajectory.CircleTrajectory4D.builder().setLocation(origin).setRadius(radius).setFrequency(0.1).setPlaneAngle(((java.lang.Math.PI) / 2)).setAngularMovement(false).build();
}