@java.lang.Override
public void load() throws java.sql.SQLException {
    localPoints = getAllPoints();
    localPhysicians = getAllPhysicians();
    progressBarPercentage = 1;
}