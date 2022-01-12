private synchronized <T extends dan200.computercraft.core.filesystem.IMountedFile> T openFile(T file, java.io.Closeable handle) throws dan200.computercraft.core.filesystem.FileSystemException {
    synchronized(m_openFiles) {
        if (((dan200.computercraft.ComputerCraft.maximumFilesOpen) > 0) && ((m_openFiles.size()) >= (dan200.computercraft.ComputerCraft.maximumFilesOpen))) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.io.IOException ignored) {
                }
            }
            throw new dan200.computercraft.core.filesystem.FileSystemException("Too many files already open");
        }
        m_openFiles.add(file);
        return file;
    }
}