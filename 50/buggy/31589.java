@java.lang.Override
public double derivative(double z) {
    double fz = compute(z);
    return fz * (1.0 - fz);
}