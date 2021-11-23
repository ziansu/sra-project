@java.lang.Override
public int compare(android.util.Size lhs, android.util.Size rhs) {
    return java.lang.Long.signum((((((long) (lhs.getWidth())) * (lhs.getHeight())) / ((long) (rhs.getWidth()))) * (rhs.getHeight())));
}