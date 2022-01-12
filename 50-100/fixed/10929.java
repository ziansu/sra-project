int valueToInt(java.lang.Object value, int defaultValue) {
    int reply = defaultValue;
    if ((value != null) && (value instanceof java.lang.String)) {
        try {
            reply = java.lang.Integer.valueOf(((java.lang.String) (value)));
        } catch (java.lang.NumberFormatException ex) {
            reply = defaultValue;
        }
    }
    return reply;
}