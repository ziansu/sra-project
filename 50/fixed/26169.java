@java.lang.Override
public void clear() {
    ++(mutationCount);
    size = 0;
    root = null;
}