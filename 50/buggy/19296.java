@java.lang.Override
public void onMonthChanged(org.unimelb.itime.vendor.helper.MyCalendar calendar) {
    android.util.Log.i(org.unimelb.itime.test.david.YinActivity.TAG, ("onMonthChanged: " + (calendar.getCalendar().getTime())));
}