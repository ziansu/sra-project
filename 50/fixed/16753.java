@java.lang.Override
public int hashCode() {
    final int shift = 32;
    long temp = java.lang.Double.doubleToLongBits(value);
    return ((int) (temp ^ (temp >>> shift)));
}