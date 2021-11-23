@java.lang.Override
public void run() {
    try {
        org.micromanager.internal.MMStudio.getInstance().data().loadData(dir, false);
    } catch (java.io.IOException e) {
        org.micromanager.internal.utils.ReportingUtils.showError(e, ("There was an error when opening the file at " + dir));
    }
}