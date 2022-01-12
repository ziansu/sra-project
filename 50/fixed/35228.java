public double getCurrent() {
    double answer = (java.lang.Math.abs(shooterMotorA.getOutputCurrent())) + (java.lang.Math.abs(shooterMotorB.getOutputCurrent()));
    answer /= 2.0;
    return answer;
}