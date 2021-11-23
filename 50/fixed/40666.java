public net.sf.memoranda.date.CalendarDate getEndRepeat() {
    net.sf.memoranda.date.CalendarDate attr = new net.sf.memoranda.date.CalendarDate(_element.getAttribute("endRepeat").getValue());
    return attr;
}