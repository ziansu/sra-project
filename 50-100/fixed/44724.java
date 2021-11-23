@java.lang.Override
public void run() {
    synchronized(this) {
        (sharedFile.refCount)--;
        if ((sharedFile.refCount) > 0)
            return ;
        
        try {
            sharedFiles.remove(sharedFile.file.getOrigin()).file.close();
        } catch (java.lang.Exception e) {
            jdbox.openedfiles.RangeMappedOpenedFileFactory.logger.error("an error occured while closing a shared file", e);
        }
    }
}