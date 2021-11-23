@java.lang.Override
public void clear() {
    for (int i = 0; i < (count); i++) {
        elements[i] = null;
    }
    count = 0;
}