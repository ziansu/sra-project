private static void findAndReplaceInTextFiles(org.bladerunnerjs.api.BRJS brjs, java.util.Collection<java.io.File> files, java.lang.String sourceRequirePrefix, java.lang.String targetRequirePrefix) throws java.io.IOException {
    for (java.io.File f : files) {
        if ((f.length()) != 0) {
            org.bladerunnerjs.model.NodeImporter.findAndReplaceInTextFile(brjs, f, sourceRequirePrefix, targetRequirePrefix);
        }
    }
}