public java.sql.Timestamp getTimestamp(java.util.Date date) {
    if (date != null) {
        LOGGER.debug("getting timestamp for {}", date);
        return new java.sql.Timestamp(date.getTime());
    }
    return null;
}