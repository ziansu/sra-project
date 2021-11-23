@java.lang.Override
public void onClick(android.view.View v) {
    startStopWatch();
    startService(intent);
    android.widget.Toast.makeText(getApplicationContext(), Constants.STARTED, Toast.LENGTH_LONG).show();
}