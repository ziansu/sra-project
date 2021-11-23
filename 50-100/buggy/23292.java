private boolean isDateSearchCriteriaValid() {
    java.lang.StringBuffer message = new java.lang.StringBuffer();
    boolean isValid = true;
    if (((startCreationDate) == null) || ((stopCreationDate) == null)) {
        message.append("Earliest Date and Most Recent Date should not be null");
        isValid = false;
    }else
        if (((startCreationDate) == null) || ((getStopCreationDate()) == null)) {
            message.append("Earliest Date and Most Recent Date should not be null");
            isValid = false;
        }
    
    errors = message.toString();
    return isValid;
}