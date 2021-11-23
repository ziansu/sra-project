@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    if (b) {
        com.project.nghicv.readingbook.util.NotificationUtil.scheduleNotification(getActivity());
    }else {
        com.project.nghicv.readingbook.util.NotificationUtil.clearNotification();
    }
}