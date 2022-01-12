@java.lang.Override
public java.lang.Void doInBackground() {
    this.firePropertyChange("starting", null, null);
    if (!(parseFiles())) {
        return null;
    }
    if (!(execScript())) {
        return null;
    }
    exportFiles();
    return null;
}