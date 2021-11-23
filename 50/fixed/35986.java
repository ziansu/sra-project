@java.lang.Override
public void onDaySelected(kr.djsch.dsmhs.beinone.materialcalendar.DayView v, java.util.Date date) {
    clearDayViews();
    v.setSelected(true);
    if ((mOnSelectedDayChangedListener) != null) {
        mOnSelectedDayChangedListener.onSelectedDayChanged(date);
    }
}