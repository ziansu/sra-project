@java.lang.Override
public void clear() {
    for (int i = 0; i < (size); i++) {
        keys[i] = null;
        values[i] = null;
    }
    size = 0;
}