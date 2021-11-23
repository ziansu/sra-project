@java.lang.Override
public long getLong(int column) {
    if ((mValue) instanceof java.lang.Integer) {
        int i = ((int) (mValue));
        return i;
    }
    return ((long) (mValue));
}