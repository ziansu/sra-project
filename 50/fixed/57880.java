public void addProvides(final java.lang.String name, final java.lang.String version) {
    provides.put(name, new org.redline_rpm.Dependency(name, version, ((version.length()) > 0 ? EQUAL : 0)));
}