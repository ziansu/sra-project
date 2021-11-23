@java.lang.Override
public void process(boolean isHotReload) throws java.lang.Exception {
    java.io.File file = ((java.io.File) (src));
    if (this.checkTime(isHotReload, file)) {
        java.lang.Object object = processInputStream(file);
        if (object != null) {
            save(_getName(), object, true);
        }
    }
}