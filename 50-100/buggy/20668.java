@org.junit.Test
public void testGeojsonPolygon() throws java.lang.Exception {
    java.sql.Statement stat = org.h2gis.functions.io.geojson.GeojsonImportExportTest.connection.createStatement();
    stat.execute("DROP TABLE IF EXISTS TABLE_POLYGON");
    stat.execute("create table TABLE_POLYGON(idarea int primary key, the_geom POLYGON)");
    stat.execute("insert into TABLE_POLYGON values(1, 'POLYGON((0 0, 2 0, 2 2, 0 2, 0 0))')");
    java.sql.ResultSet res = stat.executeQuery("SELECT ST_AsGeoJSON(the_geom) from TABLE_POLYGON;");
    res.next();
    org.junit.Assert.assertTrue(res.getString(1).equals(("{\"type\":\"Polygon\",\"coordinates\":" + "[[[0.0,0.0],[2.0,0.0],[2.0,2.0],[0.0,2.0],[0.0,0.0]]]}")));
    res.close();
    stat.close();
}