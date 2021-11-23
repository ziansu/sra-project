public java.util.Date getLegacyDateValue() {
    if ((internalDate) == null) {
        return null;
    }
    return java.util.Date.from(internalDate.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
}