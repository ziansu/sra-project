@java.lang.Override
public void run() {
    if ((((seconds) == 20) || ((seconds) == 10)) || ((seconds) == 2)) {
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), ((seconds) + " seconds left"), Toast.LENGTH_SHORT);
        toast.show();
    }
    if ((seconds) > 0) {
        (seconds)--;
    }else {
        stop();
        processResults();
    }
}