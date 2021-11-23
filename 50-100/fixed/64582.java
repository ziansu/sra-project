public boolean isValidationReady(java.lang.String date, java.lang.String hour) {
    boolean validationNotReady = false;
    if (((partition_hour) == null) || ((partition_dt) == null)) {
        partition_dt = date;
        partition_hour = hour;
    }else
        if ((!(partition_hour.equalsIgnoreCase(hour))) || (!(partition_dt.equalsIgnoreCase(date)))) {
            partition_dt = date;
            partition_hour = hour;
            validationNotReady = true;
        }
    
    return validationNotReady;
}