private java.util.List<com.google.gwt.gdata.client.EventEntry> getEventsForDay(int day) {
    java.util.List<com.google.gwt.gdata.client.EventEntry> ret = new java.util.ArrayList<com.google.gwt.gdata.client.EventEntry>();
    for (com.google.gwt.gdata.client.EventEntry entry : events) {
        for (com.google.gwt.gdata.client.When when : entry.getTimes()) {
            if ((de.graind.client.util.CalendarUtil.getDay(when.getStartTime().getDate())) == day) {
                ret.add(entry);
                break;
            }
        }
    }
    return ret;
}