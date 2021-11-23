@java.lang.Override
public de.willrich.datamanager.logic.FileList returnResult() throws java.lang.Exception {
    de.willrich.datamanager.logic.FileList fileList = de.willrich.datamanager.logic.FileList.get();
    if (isReload()) {
        subLog("Clear cached list if filled. This lead to refill the list again.");
        fileList.clear();
    }else {
        subLog("Work on the basis of cached list.");
    }
    fileList.inflate(getDirectory(), getExtensions());
    return fileList;
}