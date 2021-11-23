private static boolean rollbackSystemDB(fr.inria.soctrace.lib.storage.SystemDBObject sysDB) {
    boolean rollback = false;
    if (sysDB != null) {
        try {
            sysDB.rollback();
            rollback = true;
        } catch (fr.inria.soctrace.lib.model.utils.SoCTraceException ex) {
            java.lang.System.err.println("Exception trying to rollback System DB.");
            java.lang.System.err.println(ex.getMessage());
        }
    }
    return rollback;
}