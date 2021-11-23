public java.sql.Timestamp getTimestamp(java.util.Date date) {
    LOGGER.debug("getting timestamp for {}", date);
    if (date != null)
        return new java.sql.Timestamp(date.getTime());
    
    return null;
}