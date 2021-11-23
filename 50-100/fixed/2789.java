private void saveRootTree() {
    igrek.todotree.services.filesystem.PathBuilder dbFilePath = filesystem.pathSD().append(preferences.dbFilePath);
    try {
        java.lang.String output = treeSerializer.serializeTree(treeManager.getRootItem());
        filesystem.saveFile(dbFilePath.toString(), output);
    } catch (java.io.IOException e) {
        igrek.todotree.logger.Logs.error(e);
    }
    igrek.todotree.logger.Logs.debug("Database saved successfully.");
}