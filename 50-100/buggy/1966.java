@java.lang.Override
public void flowCompletedWithErrors(java.lang.Throwable myError) {
    if (org.jumpmind.metl.core.runtime.component.AbstractFileReader.ACTION_ARCHIVE.equals(actionOnError)) {
        archive(archiveOnErrorPath);
    }else
        if (org.jumpmind.metl.core.runtime.component.AbstractFileReader.ACTION_DELETE.equals(actionOnError)) {
            deleteFiles();
        }
    
    directory.close(false);
    directory = null;
}