public void sendListOfAvailableFiles(int size, java.util.Set<ru.spbau.mit.TrackerFileInfo> files) throws java.io.IOException {
    out.writeInt(size);
    out.flush();
    for (ru.spbau.mit.TrackerFileInfo file : files) {
        out.writeInt(file.getID());
        out.writeUTF(file.getName());
        out.writeLong(file.getSize());
        out.flush();
    }
}