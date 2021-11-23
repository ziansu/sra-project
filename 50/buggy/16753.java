@java.lang.Override
public int hashCode() {
    final int shift = 32;
    long temp = java.lang.Double.doubleToLongBits(value);
    int result = ((int) (temp ^ (temp >>> shift)));
    return result;
}