@org.junit.Test
public void testGeojsonMultiPoint() throws java.lang.Exception {
    java.sql.Statement stat = org.h2gis.functions.io.geojson.GeojsonImportExportTest.connection.createStatement();
    stat.execute("DROP TABLE IF EXISTS TABLE_MULTIPOINT");
    stat.execute("create table TABLE_MULTIPOINT(idarea int primary key, the_geom MULTIPOINT)");
    stat.execute("insert into TABLE_MULTIPOINT values(1, 'MULTIPOINT ((190 320), (180 160), (394 276))')");
    java.sql.ResultSet res = stat.executeQuery("SELECT ST_AsGeoJSON(the_geom) from TABLE_MULTIPOINT;");
    res.next();
    org.junit.Assert.assertTrue(res.getString(1).equals(("{\"type\":\"MultiPoint\",\"coordinates\":[" + (("[190.0,320.0]," + "[180.0,160.0],") + "[394.0,276.0]]}"))));
    res.close();
    stat.close();
}