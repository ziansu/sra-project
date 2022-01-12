@org.junit.BeforeClass
public static void init() {
    try {
        org.geotoolkit.data.geojson.GeoJSONWriteTest.PROPERTIES.load(org.geotoolkit.data.geojson.GeoJSONWriteTest.class.getResourceAsStream("/org/geotoolkit/geojson/geometries.properties"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}