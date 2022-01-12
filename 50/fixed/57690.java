@java.lang.Override
public java.lang.String toString() {
    if ((lower) == (higher)) {
        return java.lang.Double.toString(higher);
    }
    return ((lower) + "-") + (higher);
}