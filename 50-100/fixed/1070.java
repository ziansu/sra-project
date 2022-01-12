@java.lang.Override
public double[] getUsefulTrimmedData() {
    double[] force = new double[getTrimmedData().length];
    double[] data = getTrimmedData();
    for (int i = 0; i < (force.length); i++) {
        force[i] = java.lang.Math.abs(data[i]);
    }
    return force;
}