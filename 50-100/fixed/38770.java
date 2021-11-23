public void putEvent(android.content.Context activity, boolean selected, android.widget.TextView textView, android.widget.RelativeLayout relativeLayout, int date, int month, int year) {
    java.lang.String key = (((date + "_") + month) + "_") + year;
    com.roadster.sakhala.multselectioncalendarview.calendarview.Event event = getEventsMap().get(key);
    if (null != event)
        textView.setTextColor(android.graphics.Color.parseColor(event.getColorId()));
    
}