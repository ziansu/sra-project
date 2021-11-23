public java.util.Date getDate(java.sql.Timestamp timestamp) {
    if (timestamp != null) {
        LOGGER.debug("getting date for {}", timestamp);
        return new java.util.Date(timestamp.getTime());
    }
    return null;
}