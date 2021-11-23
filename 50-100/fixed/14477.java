@org.junit.Test
public void testGeojsonPoint() throws java.lang.Exception {
    java.sql.Statement stat = org.h2gis.functions.io.geojson.GeojsonImportExportTest.connection.createStatement();
    stat.execute("DROP TABLE IF EXISTS TABLE_POINT");
    stat.execute("create table TABLE_POINT(idarea int primary key, the_geom POINT)");
    stat.execute("insert into TABLE_POINT values(1, 'POINT(1 2)')");
    java.sql.ResultSet res = stat.executeQuery("SELECT ST_AsGeoJSON(the_geom) from TABLE_POINT;");
    res.next();
    assertTrue(res.getString(1).equals("{\"type\":\"Point\",\"coordinates\":[1.0,2.0]}"));
    res.close();
    stat.close();
}