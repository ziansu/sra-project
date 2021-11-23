@java.lang.Override
public void call() {
    getView().hideSyncProgressDialog();
    pullTracings();
}