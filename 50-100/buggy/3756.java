@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    com.group.creation.domisol.diary.calendar.CalendarItemView itemView;
    if (convertView == null) {
        itemView = new com.group.creation.domisol.diary.calendar.CalendarItemView(context, calendarItems.get(position));
    }else {
        itemView = ((com.group.creation.domisol.diary.calendar.CalendarItemView) (convertView));
    }
    if (((calendarItems.size()) + 1) > position)
        itemView.setContents(calendarItems.get(position).getContents());
    
    return itemView;
}