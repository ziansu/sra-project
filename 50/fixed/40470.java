@org.orbisgis.mapuce.randomForest.BeforeClass
public static void tearUp() throws java.lang.Exception {
    org.orbisgis.mapuce.randomForest.RandomForestTest.connection = org.h2gis.h2spatial.ut.SpatialH2UT.createSpatialDataBase(org.orbisgis.mapuce.randomForest.RandomForestTest.DB_NAME);
}