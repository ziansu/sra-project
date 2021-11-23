private void addCubicPressurePolynomial(us.ihmc.quadrupedRobotics.planning.trajectory.RobotEnd robotEnd, double t0, double tFinal, double z0, double zd0, double zFinal, double zdFinal) {
    us.ihmc.quadrupedRobotics.planning.trajectory.QuadrupedPiecewisePolynomialCopTrajectory.YoTimedPolynomial polynomial = pressurePolynomialsPerEnd.get(robotEnd).get(numberOfPressurePolynomialsPerEnd.get(robotEnd).getIntegerValue());
    polynomial.setTimeInterval(t0, tFinal);
    polynomial.setCubic(0.0, (tFinal - t0), z0, zd0, zFinal, zdFinal);
    numberOfPressurePolynomialsPerEnd.get(robotEnd).increment();
}