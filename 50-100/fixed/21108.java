public net.sf.memoranda.date.CalendarDate getEndRepeat() {
    java.lang.String temp;
    try {
        temp = _element.getAttribute("endRepeat").getValue();
    } catch (java.lang.NullPointerException e) {
        temp = "";
    }
    net.sf.memoranda.date.CalendarDate attr;
    if (temp.equals("")) {
        attr = null;
    }else {
        attr = new net.sf.memoranda.date.CalendarDate(temp);
    }
    return attr;
}