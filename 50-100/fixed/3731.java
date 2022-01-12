public static boolean getConfig(java.lang.String key, boolean default_val) {
    java.lang.String value = org.loklak.data.DAO.config.get(key);
    return value == null ? default_val : ((value.equals("true")) || (value.equals("on"))) || (value.equals("1"));
}