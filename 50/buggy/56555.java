@java.lang.Override
public void onFailed() {
    android.widget.Toast.makeText(this, "There was a problem while syncing the data", Toast.LENGTH_SHORT).show();
    onComplete();
}