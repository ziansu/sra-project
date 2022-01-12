@java.lang.Override
public double curve(double t) {
    if (t <= 0.5) {
        return (1 - (super.curve((1 - (t * 2))))) * 0.5;
    }
    return ((super.curve(((t * 2) - 1))) * 0.5) + 0.5;
}