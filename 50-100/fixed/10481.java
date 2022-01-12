private java.util.Date parseDateValue(java.lang.String value) {
    try {
        if (!(android.text.TextUtils.isEmpty(value))) {
            java.util.Date time = new java.util.Date(java.lang.Long.parseLong(value));
            return time;
        }
    } catch (java.lang.NumberFormatException e) {
        timber.log.Timber.e("parseDateValue() - Value is not a number: %s", value);
    }
    return null;
}