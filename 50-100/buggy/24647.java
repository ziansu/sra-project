public static void removeEvent(net.sf.memoranda.date.CalendarDate date, int hour, int minute) {
    net.sf.memoranda.EventsManager.Day day = net.sf.memoranda.EventsManager.getDay(date);
    if (day == null)
        day.getElement().removeChild(net.sf.memoranda.EventsManager.getEvent(date, hour, minute).getContent());
    
}