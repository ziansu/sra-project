public static boolean isValid(java.lang.String value) {
    if (value.contains("/")) {
        value = value.replace("/", "_");
    }
    try {
        com.cloudcraftgaming.discal.utils.TimeZone tz = com.cloudcraftgaming.discal.utils.TimeZone.valueOf(value);
        return true;
    } catch (java.lang.IllegalArgumentException e) {
        return false;
    }
}