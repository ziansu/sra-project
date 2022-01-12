private static com.rgi.android.geopackage.GeoPackage createGeoPackage(final java.lang.String tableName, final java.lang.String columnName, final java.io.File testFile) throws com.rgi.android.geopackage.verification.ConformanceException, java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    com.rgi.android.geopackage.GeoPackage gpkg = new com.rgi.android.geopackage.GeoPackage(testFile, com.rgi.android.geopackage.GeoPackage.OpenMode.Create);
    try {
        gpkg.close();
        geopackage.GeoPackageSchemaAPITest.createTable(tableName, columnName, testFile);
        return new com.rgi.android.geopackage.GeoPackage(testFile, com.rgi.android.geopackage.verification.VerificationLevel.None, com.rgi.android.geopackage.GeoPackage.OpenMode.Open);
    } finally {
    }
}