private java.lang.String genLssName() {
    return ((getPackageName()) + ".keepalive.") + ((java.lang.System.currentTimeMillis()) / 10000);
}