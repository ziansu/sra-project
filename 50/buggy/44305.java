@java.lang.Override
public int compare(com.tds.persistence.TdsEvent event1, com.tds.persistence.TdsEvent event2) {
    return java.lang.Long.valueOf(event1.getTimestamp()).compareTo(java.lang.Long.valueOf(event2.getTimestamp()));
}