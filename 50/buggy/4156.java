@java.lang.Override
public void process(boolean isHotReload) throws java.lang.Exception {
    java.io.File file = ((java.io.File) (src));
    if (this.checkTime(isHotReload, file)) {
        processInputStream(_getName(), file);
    }
}