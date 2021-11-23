public static void removeLowPriority(calendar.iCalendar cal, int minPriority) {
    for (int i = 0; i < (cal.getEvents().size()); i++) {
        if ((cal.getEvents().get(i).getPriority()) > minPriority) {
            cal.getEvents().remove(i);
            i--;
        }
    }
}