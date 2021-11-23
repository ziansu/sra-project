private java.lang.Comparable newComparable(java.lang.String version) {
    org.apache.maven.artifact.versioning.ComparableVersion ret = new org.apache.maven.artifact.versioning.ComparableVersion(version);
    java.lang.String canonical = ret.getCanonical();
    java.lang.String parsedCanonical = new org.apache.maven.artifact.versioning.ComparableVersion(canonical).getCanonical();
    java.lang.System.out.println(((("canonical( " + version) + " ) = ") + canonical));
    assertEquals(((((("canonical( " + version) + " ) = ") + canonical) + " -> canonical: ") + parsedCanonical), canonical, parsedCanonical);
    return ret;
}