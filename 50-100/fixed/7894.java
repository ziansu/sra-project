@java.lang.Override
public double curve(double t) {
    if ((t *= 2) < 1) {
        return 0.5 * ((t * t) * ((((amount) + 1) * t) - (amount)));
    }
    return 0.5 * ((((t -= 2) * t) * ((((amount) + 1) * t) + (amount))) + 2);
}