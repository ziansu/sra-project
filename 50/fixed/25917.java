@java.lang.Override
public void load() throws java.sql.SQLException {
    java.lang.System.out.println("loading physicians and points from DB to local copies ");
    localPoints = getAllPoints();
    localPhysicians = getAllPhysicians();
}