public void moveTo(com.shc.silenceengine.io.FilePath path) throws java.io.IOException {
    if (((getType()) == (com.shc.silenceengine.io.FilePath.Type.RESOURCE)) || ((path.getType()) == (com.shc.silenceengine.io.FilePath.Type.RESOURCE)))
        throw new com.shc.silenceengine.core.SilenceException("Cannot move resource files!");
    
    java.nio.file.Files.move(java.nio.file.Paths.get(this.path), java.nio.file.Paths.get(path.getPath()));
}