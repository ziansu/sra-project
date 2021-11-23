public void takeSnapShot() {
    java.lang.String currentDirPath = createDirectory();
    snapShotDiagram(currentDirPath);
    snapShotQualityCurve(currentDirPath);
    snapShotAxes(currentDirPath);
    saveConfig(currentDirPath);
    saveParameterValues(currentDirPath);
    saveStatistics(currentDirPath);
}