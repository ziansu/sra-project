private static java.lang.Object div(final double num, final double denom, final boolean force) {
    final double result = num / denom;
    if ((!force) && ((result * denom) == num))
        return ((long) (result));
    
    return result;
}