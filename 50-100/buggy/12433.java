@java.lang.Override
public double curve(double a) {
    if (a <= 0.5) {
        return (1 - (out((1 - (a * 2))))) * 0.5;
    }
    return ((out(((a * 2) - 1))) * 0.5) + 0.5;
}