@java.lang.Override
public int compare(web.business.MetadataIndex o1, web.business.MetadataIndex o2) {
    try {
        java.util.Date d1 = mode.getDateFormat().parse(o1.getName());
        java.util.Date d2 = mode.getDateFormat().parse(o2.getName());
        return d2.compareTo(d1);
    } catch (java.text.ParseException e) {
        return o1.getName().compareTo(o2.getName());
    }
}