@java.lang.Override
public java.lang.String toString() {
    if ((scale) == 1) {
        return java.lang.String.valueOf(value);
    }
    return java.lang.Double.valueOf((((double) (value)) / ((double) (getScale())))).toString();
}