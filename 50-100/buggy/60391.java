@java.lang.Override
public int compare(web.business.MetadataIndex o1, web.business.MetadataIndex o2) {
    try {
        java.util.Date d1 = mode.getDateFormat().parse(o1.getName());
        java.util.Date d2 = mode.getDateFormat().parse(o2.getName());
        return d2.compareTo(d1);
    } catch (java.text.ParseException e) {
        throw new java.lang.IllegalStateException(("Failed to parse chronology name: " + (e.getMessage())));
    }
}