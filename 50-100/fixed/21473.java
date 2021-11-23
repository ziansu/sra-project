@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    date.set(year, month, dayOfMonth);
    dateEdit.setText(happyyoung.trashnetwork.recycle.util.DateTimeUtil.convertTimestamp(this.context, date.getTime(), true, false));
    if ((this.listener) != null)
        this.listener.onDateChanged(date);
    
}