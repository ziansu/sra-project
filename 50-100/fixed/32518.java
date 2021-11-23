@org.junit.Test
public void testReadGeoJSON2() throws java.lang.Exception {
    java.sql.Statement stat = org.h2gis.functions.io.geojson.GeojsonImportExportTest.connection.createStatement();
    java.sql.ResultSet res = stat.executeQuery("SELECT ST_GeomFromGeoJSON(\'{\"type\":\"LineString\",\"coordinates\":[[1,1],[10,10]]}\')");
    res.next();
    assertTrue(res.getString(1).equals("LINESTRING (1 1, 10 10)"));
    stat.close();
}