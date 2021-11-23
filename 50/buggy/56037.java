@java.lang.Override
public void onStopped() {
    java.lang.String toastMessage = "video stopped";
    android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
    toast.show();
}