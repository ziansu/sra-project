@java.lang.Override
public java.lang.Object start() {
    try {
        domDb.findKeys(idx);
    } catch (org.exist.storage.BTreeException | java.io.IOException e) {
        org.exist.storage.LOG.warn(("start() - " + "error while removing doc"), e);
    }
    return null;
}