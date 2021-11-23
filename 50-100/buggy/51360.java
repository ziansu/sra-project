@java.lang.Override
public java.util.List<java.lang.String> getAGBDifferencesForDemo(int sourceId, int version1, int version2) {
    readAllAGBVersionsOfSource(sourceId, version1, version2);
    writeSelectedVersionsOfSource(getSelectedVersion1(), getSelectedVersion2());
    compareSelectedVersions(getSelectedVersion1(), getSelectedVersion2());
    showReadableDifferences();
    writeReadableDiffereces();
    return readableDifferences;
}