@java.lang.Override
public void checkOrphan() {
    if ((_row) == null) {
        throw new java.lang.IllegalStateException("doesn't connect to parent");
    }
}