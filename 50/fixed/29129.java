@java.lang.Override
public double round(double points) {
    double intPoints = java.lang.Math.round((points * 2.0));
    return intPoints / 2.0;
}