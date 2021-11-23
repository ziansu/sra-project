private synchronized void loadFromDir(java.io.File file) throws java.io.FileNotFoundException {
    java.io.File[] jsonFiles = file.listFiles(filenameFilter());
    for (java.io.File jsonFile : jsonFiles) {
        try {
            mapOfMap.put(jsonFile.getName().split("\\.")[0], loadJsonFile(jsonFile));
        } catch (java.lang.Exception e) {
            ai.subut.kurjun.db.file.FileDb.LOGGER.error("****** Error in FileDb.loadFromDir:", e);
        }
    }
}