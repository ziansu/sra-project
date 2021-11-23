private static java.lang.String printManifestEntry(java.lang.String key, java.lang.String defaultValue) {
    java.lang.String value = owltools.version.VersionInfo.getManifestVersion(key);
    if ((value == null) || (value.isEmpty())) {
        value = defaultValue;
    }
    java.lang.System.out.println(((key + "\t") + value));
    return value;
}