@java.lang.Override
public java.lang.Class<? extends org.datavyu.plugins.DataViewer> getViewerClass() {
    if (com.sun.jna.Platform.isWindows()) {
        return org.datavyu.plugins.quicktime.QTDataViewer.class;
    }
    return null;
}