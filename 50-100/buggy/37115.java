public static java.lang.String getcalculatedOSGiVersion(java.lang.String versionStr) {
    com.tibco.bw.maven.plugin.osgi.helpers.Version version = com.tibco.bw.maven.plugin.osgi.helpers.VersionParser.parseVersion(versionStr);
    java.lang.String calcQualifier = com.tibco.bw.maven.plugin.osgi.helpers.VersionParser.calculateQualifier(version.getQualifier());
    java.lang.String fullVersion = ((((((version.getMajor()) + ".") + (version.getMinor())) + ".") + (version.getMicro())) + ".") + calcQualifier;
    return fullVersion;
}