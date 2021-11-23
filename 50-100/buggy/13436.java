@java.lang.Override
public java.lang.String toString() {
    if ((scale) == 1) {
        return java.lang.String.valueOf(value);
    }
    return new java.lang.Double((((double) (value)) / ((double) (getScale())))).toString();
}