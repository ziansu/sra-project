@java.lang.Override
public double curve(double t) {
    return 1 - (super.curve((1 - t)));
}