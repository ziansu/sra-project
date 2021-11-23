@java.lang.Override
public void onClick(android.view.View v) {
    startStopWatch();
    startService(new android.content.Intent(getApplicationContext(), tracking.id11723222.com.trackingapplication.services.TrackingService.class));
    android.widget.Toast.makeText(getApplicationContext(), Constants.STARTED, Toast.LENGTH_LONG).show();
}