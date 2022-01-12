@java.lang.Override
public void onClick(android.view.View v) {
    if (!(Constants.ALARMMANAGER_STARTED)) {
        startAlarmManager();
        startProgressbar();
        Constants.ALARMMANAGER_STARTED = true;
        Constants.START_TIME = com.synergyforce.rashel.sundail.Utils.getTheCurrentDateAndTime();
    }else {
        android.widget.Toast.makeText(this, "GLASS CLOCK is already started", Toast.LENGTH_SHORT).show();
    }
}