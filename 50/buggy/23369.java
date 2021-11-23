@java.lang.Override
public void onClick(android.view.View v) {
    assignmentsLayoutManager.scrollToPositionWithOffset(getCurrentDayIndex(), 0);
    edu.byu.dtaylor.homeworknotifier.notifications.AlarmReceiver ar = new edu.byu.dtaylor.homeworknotifier.notifications.AlarmReceiver();
    ar.onReceive(this, null);
}