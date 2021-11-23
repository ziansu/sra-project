@java.lang.Override
public double round(double points) {
    int intPoints = ((int) (points * 2.0));
    return intPoints / 2.0;
}