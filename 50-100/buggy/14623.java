private void openForWriting() {
    initializeHelper();
    boolean performRecreate = false;
    try {
        database = helper.getWritableDatabase();
    } catch (com.yahoo.squidb.data.AbstractDatabase.RecreateDuringMigrationException recreate) {
        performRecreate = true;
    } catch (com.yahoo.squidb.data.AbstractDatabase.MigrationFailedException fail) {
        onError(fail.getMessage(), fail);
        onMigrationFailed(fail.oldVersion, fail.newVersion);
    } catch (java.lang.RuntimeException e) {
        onError(("Failed to open database: " + (getName())), e);
        throw e;
    }
    if (performRecreate) {
        recreate();
    }
}