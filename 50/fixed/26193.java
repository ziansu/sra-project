@java.lang.Override
public void call() {
    if ((getView()) != null) {
        getView().hideSyncProgressDialog();
        pullTracings();
    }
}