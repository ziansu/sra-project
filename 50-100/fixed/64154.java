@java.lang.Override
public void onClick(android.view.View v) {
    if (!(Constants.ALARMMANAGER_STARTED)) {
        Constants.START_TIME = com.synergyforce.rashel.sundail.Utils.getTheCurrentDateAndTime();
        startAlarmManager();
        startProgressbar();
        Constants.ALARMMANAGER_STARTED = true;
    }else {
        android.widget.Toast.makeText(this, "GLASS CLOCK is already started", Toast.LENGTH_SHORT).show();
    }
}