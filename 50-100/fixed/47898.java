@java.lang.Override
public void onDateSelected(@android.support.annotation.NonNull
com.prolificinteractive.materialcalendarview.MaterialCalendarView widget, @android.support.annotation.NonNull
com.prolificinteractive.materialcalendarview.CalendarDay date, boolean selected) {
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
    currentDateEventList.clear();
    for (hitam.epics.sahaya.support.EventItem item : eventList) {
        if (item.getDate().equals(simpleDateFormat.format(date.getDate()))) {
            currentDateEventList.add(item);
        }
    }
    adapter.notifyDataSetChanged();
}