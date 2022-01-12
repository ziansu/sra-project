@java.lang.Override
public double getCoordinate(final int dim) {
    if ((dim < 0) || (dim >= (c.length))) {
        throw new java.lang.IllegalArgumentException((((dim + "is not an allowed dimension, only values between 0 and ") + (c.length)) + "are allowed."));
    }
    return c[dim];
}