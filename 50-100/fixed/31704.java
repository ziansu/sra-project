private boolean fieldsAreEmpty(java.util.List<java.lang.String> list) {
    for (java.lang.String str : list) {
        if ((str == null) || ((str.trim().length()) == 0)) {
            return false;
        }
    }
    setMessage("Field(s) are empty");
    com.netcracker.cinema.validation.routines.EmptyFieldsValidator.logger.log(org.apache.log4j.Level.WARN, getMessage());
    return true;
}