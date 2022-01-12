@org.junit.BeforeClass
public static void init() throws java.io.IOException {
    org.geotoolkit.data.geojson.GeoJSONWriteTest.PROPERTIES.load(org.geotoolkit.data.geojson.GeoJSONWriteTest.class.getResourceAsStream("/org/geotoolkit/geojson/geometries.properties"));
}