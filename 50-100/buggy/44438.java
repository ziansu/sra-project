@java.lang.Override
public void process(boolean isHotReload) throws java.lang.Exception {
    java.io.File file = ((java.io.File) (src));
    if (isHotReload) {
        java.lang.String fileName = file.getName();
        long lastModified = file.lastModified();
        if (!(this.checkTime(fileName, lastModified))) {
            return ;
        }
    }
    java.lang.Object object = processInputStream(file);
    if (object != null) {
        save(_getName(), object, true);
    }
}