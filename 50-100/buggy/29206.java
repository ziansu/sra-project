@java.lang.Override
public double calculateSignal(double[] accel, double angularVelocity) {
    p = rm.getParameters();
    double u = ((((p.Lr) * (p.r)) + ((p.L1) * (x1))) + ((p.L2) * (x2))) - (v);
    return 0;
}