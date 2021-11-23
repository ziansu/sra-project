public static double ceilHack(double val) {
    double vfloored = ((int) (val));
    if (vfloored != val) {
        return vfloored + 1;
    }
    return val;
}