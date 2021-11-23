@java.lang.Override
public double calculateSignal(double[] accel, double angularVelocity) {
    p = rm.getParameters();
    return ((((p.Lr) * (p.r)) + ((p.L1) * (x1))) + ((p.L2) * (x2))) - (v);
}