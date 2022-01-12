@java.lang.Override
public void drain() {
    for (int i = 0; i < (size); i++) {
        tasks.set(i, null);
    }
}