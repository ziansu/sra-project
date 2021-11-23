private java.util.List<japicmp.cmp.JApiCmpArchive> createFileList(java.lang.String option) {
    java.lang.String[] parts = option.split(";");
    java.util.List<japicmp.cmp.JApiCmpArchive> jApiCmpArchives = new java.util.ArrayList<>(parts.length);
    for (java.lang.String part : parts) {
        java.io.File file = new java.io.File(part);
        japicmp.cmp.JApiCmpArchive jApiCmpArchive = new japicmp.cmp.JApiCmpArchive(file, "n.a.");
        jApiCmpArchives.add(jApiCmpArchive);
    }
    return jApiCmpArchives;
}