@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    long time = intent.getLongExtra("time", 0);
    if (com.example.TimeTrackerActivity.ACTION_TIME_UPDATE.equals(action)) {
        android.widget.TextView counter = ((android.widget.TextView) (this.findViewById(R.id.counter)));
        if (counter != null)
            counter.setText(android.text.format.DateUtils.formatElapsedTime((time / 1000)));
        
    }
}