public static java.lang.String[] getConfig(java.lang.String key, java.lang.String[] default_val, java.lang.String delim) {
    java.lang.String value = org.loklak.data.DAO.config.get(key);
    return (value == null) || ((value.length()) == 0) ? default_val : value.split(delim);
}