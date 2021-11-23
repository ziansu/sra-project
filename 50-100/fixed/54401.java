public static void removeEvent(net.sf.memoranda.date.CalendarDate date, int hh, int mm) {
    if ((net.sf.memoranda.EventsManager.getDay(date)) == null) {
        net.sf.memoranda.EventsManager.getDay(date).getElement().removeChild(net.sf.memoranda.EventsManager.getEvent(date, hh, mm).getContent());
    }
}