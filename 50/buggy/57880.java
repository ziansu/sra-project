public void addProvides(final java.lang.String name, final java.lang.String version) {
    provides.add(new org.redline_rpm.Dependency(name, version, ((version.length()) > 0 ? EQUAL : 0)));
}