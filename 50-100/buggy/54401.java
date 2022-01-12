public static void removeEvent(net.sf.memoranda.date.CalendarDate date, int hh, int mm) {
    net.sf.memoranda.EventsManager.Day d = net.sf.memoranda.EventsManager.getDay(date);
    if (d == null) {
        d.getElement().removeChild(net.sf.memoranda.EventsManager.getEvent(date, hh, mm).getContent());
    }
}