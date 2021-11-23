@java.lang.Override
public void onClick(android.view.View v) {
    java.util.Date date = datesList.get(holder.getAdapterPosition());
    if ((!(date.before(horizontalCalendar.getDateStartCalendar()))) && (!(date.after(horizontalCalendar.getDateEndCalendar())))) {
        horizontalCalendarView.setSmoothScrollSpeed(HorizontalLayoutManager.SPEED_SLOW);
        horizontalCalendar.centerCalendarToPosition(holder.getAdapterPosition());
    }
}