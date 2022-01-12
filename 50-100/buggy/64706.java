@org.junit.Test
public void testGeojsonMultiLineString() throws java.lang.Exception {
    java.sql.Statement stat = org.h2gis.functions.io.geojson.GeojsonImportExportTest.connection.createStatement();
    stat.execute("DROP TABLE IF EXISTS TABLE_MULTILINESTRING");
    stat.execute("create table TABLE_MULTILINESTRING(idarea int primary key, the_geom MULTILINESTRING)");
    stat.execute(("insert into TABLE_MULTILINESTRING values(1, \'MULTILINESTRING ((80 240, 174 356, 280 250), \n" + "  (110 140, 170 240, 280 360))')"));
    java.sql.ResultSet res = stat.executeQuery("SELECT ST_AsGeoJSON(the_geom) from TABLE_MULTILINESTRING;");
    res.next();
    org.junit.Assert.assertTrue(res.getString(1).equals(("{\"type\":\"MultiLineString\",\"coordinates\":[" + ("[[80.0,240.0],[174.0,356.0],[280.0,250.0]]," + "[[110.0,140.0],[170.0,240.0],[280.0,360.0]]]}"))));
    res.close();
    stat.close();
}