private boolean isVersionGreaterOrEquals_1_2_0() {
    java.lang.String[] versionSplit = testEditorVersion.split("\\.");
    int major = java.lang.Integer.parseInt(versionSplit[0]);
    int minor = java.lang.Integer.parseInt(versionSplit[1]);
    return ((major == 1) && (minor > 2)) || (major > 1);
}