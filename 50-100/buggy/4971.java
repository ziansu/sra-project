public java.lang.String getErrorDescription() {
    if ((failureReason) != null) {
        int maxChars = 200;
        int index = failureReason.indexOf('\n');
        if (index > maxChars) {
            return (failureReason.substring(0, maxChars).trim()) + "...";
        }else {
            return failureReason.substring(0, index).trim();
        }
    }
    return "";
}