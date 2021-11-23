@java.lang.Override
public java.lang.Integer poll() {
    long i = index;
    if (i == (end)) {
        return null;
    }
    index = i + 1;
    return ((int) (i));
}