public java.lang.String settingValueToString(java.lang.String setting) {
    synchronized(LOCK) {
        return settings.get(setting).toString();
    }
}