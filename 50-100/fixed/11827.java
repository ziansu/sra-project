public int run(java.io.File source, java.io.File destination) {
    status = org.dataaccessioner.Migrator.STATUS_INITIALIZING;
    try {
        status = org.dataaccessioner.Migrator.STATUS_RUNNING;
        status = copyDirectory(source, destination);
    } catch (java.io.FileNotFoundException ex) {
        setStatusMessage(ex.getLocalizedMessage());
        return org.dataaccessioner.Migrator.STATUS_FAILURE;
    } catch (java.lang.Exception ex) {
        setStatusMessage(("Unexpected Failure: " + (ex.getLocalizedMessage())));
        return org.dataaccessioner.Migrator.STATUS_FAILURE;
    }
    return status;
}