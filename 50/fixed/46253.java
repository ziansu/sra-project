protected void addProvides(final java.lang.CharSequence name, final java.lang.CharSequence version, final int flag) {
    provides.put(name.toString(), new org.redline_rpm.Dependency(name.toString(), version.toString(), flag));
}