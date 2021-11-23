@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case wayne.mycalendar.CalendarView.BaseCalendar.GET_ON_SELECTED_DATE :
            mDate = ((java.util.Date) (msg.obj));
            if ((listener) != null) {
                listener.onResult(mDate);
            }
            break;
        case wayne.mycalendar.CalendarView.BaseCalendar.SET_TITLE_BAR_COLOR :
            int color = java.lang.Integer.valueOf(msg.obj.toString());
            ll_title_bar.setBackgroundColor(color);
            break;
        default :
            break;
    }
    super.handleMessage(msg);
}