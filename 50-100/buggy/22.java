@java.lang.Override
public void onClick(android.view.View v) {
    if ((!(activities.isEmpty())) && (activities.peek().isFinished())) {
        startStopButton.setText("Stop");
        activities.push(new me.jbakita.pebbledatalogging.MainActivity.MotionActivity(java.lang.System.currentTimeMillis()));
    }else {
        startStopButton.setText("Start");
        activities.peek().endTime = java.lang.System.currentTimeMillis();
        getMotionActivity(activities.peek());
    }
}