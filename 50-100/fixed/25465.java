@java.lang.Override
public java.lang.Object start() {
    try {
        domDb.remove(transaction, idx, null);
    } catch (org.exist.storage.BTreeException | java.io.IOException e) {
        org.exist.storage.LOG.error(("start() - " + "error while removing doc"), e);
    } catch (final org.exist.xquery.TerminatedException e) {
        org.exist.storage.LOG.error("method terminated", e);
    }
    return null;
}