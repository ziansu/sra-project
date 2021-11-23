public static long getConfig(java.lang.String key, long default_val) {
    java.lang.String value = org.loklak.data.DAO.config.get(key);
    try {
        return value == null ? default_val : java.lang.Long.parseLong(value);
    } catch (java.lang.NumberFormatException e) {
        return default_val;
    }
}