public static java.util.Date parseDate(java.lang.String dateString) {
    try {
        return org.dcm4chee.archive.monitoring.rs.TimeHelpers.dateParser.parse(dateString);
    } catch (java.lang.Exception e) {
        org.dcm4chee.archive.monitoring.rs.TimeHelpers.LOGGER.error("Error while parsing date string", e);
    }
    return null;
}