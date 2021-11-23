public java.sql.Timestamp getDateLastTake() {
    if ((dateLastRelease) == null)
        return null;
    
    return new java.sql.Timestamp(dateLastTake.getMillis());
}