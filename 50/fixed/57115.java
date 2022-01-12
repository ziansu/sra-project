public void takeSnapShot() {
    java.lang.String currentDirPath = createDirectory();
    saveStatistics(currentDirPath);
    snapShotDiagram(currentDirPath);
    snapShotQualityCurve(currentDirPath);
    snapShotAxes(currentDirPath);
    saveConfig(currentDirPath);
    saveParameterValues(currentDirPath);
}