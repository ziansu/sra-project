@org.junit.Test
public void hotelsTest() {
    try {
        java.lang.String hotels = ((net.gmsworld.server.layers.HotelsBookingUtils) (net.gmsworld.server.layers.LayerHelperFactory.getInstance().getByName(Commons.HOTELS_LAYER))).extendFeatureCollection(lat, lng, net.gmsworld.server.layers.LayersTest.radius, net.gmsworld.server.layers.LayersTest.limit, "stars", locale);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}