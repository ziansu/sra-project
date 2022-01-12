private nl.esciencecenter.xenon.filesystems.Path createPath(java.lang.String path) {
    java.lang.String baseDir = java.lang.System.getProperty("xenon.basedir");
    if (baseDir == null) {
        return fileSystem.getEntryPath().resolve(path);
    }
    return fileSystem.getEntryPath().resolve(new nl.esciencecenter.xenon.filesystems.Path(baseDir).resolve(new nl.esciencecenter.xenon.filesystems.Path(path)));
}