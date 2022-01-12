private java.util.List<net.fortuna.ical4j.model.component.VEvent> filterByValidPeriod(java.util.List<net.fortuna.ical4j.model.component.VEvent> events, java.util.List<net.fortuna.ical4j.model.component.VToDo> todos, com.calendar.service.Setting setting) throws java.text.ParseException {
    net.fortuna.ical4j.model.Period period = com.calendar.util.FilterUtil.makeValidPeriod(setting);
    net.fortuna.ical4j.filter.Filter filter = new net.fortuna.ical4j.filter.Filter(new net.fortuna.ical4j.filter.PeriodRule(period));
    return ((java.util.List<net.fortuna.ical4j.model.component.VEvent>) (filter.filter(events)));
}