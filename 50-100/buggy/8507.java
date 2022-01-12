@java.lang.Override
protected void loadFileSystem(final com.linxonline.mallet.io.filesystem.FileSystem _fileSystem) {
    com.linxonline.mallet.util.logger.Logger.println("Finalising filesystem.", Logger.Verbosity.MINOR);
    com.linxonline.mallet.io.filesystem.GlobalFileSystem.setFileSystem(_fileSystem);
    java.lang.System.out.println("Mapping Base directory.");
    if ((com.linxonline.mallet.io.filesystem.GlobalFileSystem.mapDirectory("base/")) == false) {
        com.linxonline.mallet.util.logger.Logger.println("Failed to map base directory.", Logger.Verbosity.MINOR);
    }
}