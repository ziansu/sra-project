public java.lang.String getErrorDescription() {
    if ((failureReason) != null) {
        int index = failureReason.indexOf('\n');
        return index < 0 ? failureReason : failureReason.substring(0, index).trim();
    }
    return "";
}