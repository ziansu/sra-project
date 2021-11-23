@java.lang.Override
public double getDouble(int column) {
    if ((mValue) instanceof java.lang.Float) {
        float f = ((float) (mValue));
        return f;
    }
    return ((double) (mValue));
}