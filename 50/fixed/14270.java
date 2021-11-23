@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    okButton.setProgress(0);
    okButton.setEnabled(true);
}