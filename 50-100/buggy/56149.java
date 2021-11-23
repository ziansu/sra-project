public static void queueWriteTask(java.nio.file.Path path, byte[] data) {
    assert (path != null) && (data != null);
    assert java.nio.file.Files.isWritable(path);
    assert (!(java.nio.file.Files.exists(path))) || (java.nio.file.Files.isRegularFile(path));
    nbtool.nio.FileIO.addTaskToQueue(new nbtool.nio.FileIO.Task(path, data));
}