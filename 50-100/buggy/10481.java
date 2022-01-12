private java.util.Date parseDateValue(java.lang.String value) {
    try {
        if (!(android.text.TextUtils.isEmpty(value))) {
            return new java.util.Date(java.lang.Long.parseLong(value));
        }
    } catch (java.lang.NumberFormatException e) {
        timber.log.Timber.e("parseDateValue() - Value is not a number: %s", value);
    }
    return null;
}