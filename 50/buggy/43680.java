public long getInitTime() {
    long value = getLong(R.string.pref_init_time, new java.util.Date().getTime());
    return value;
}