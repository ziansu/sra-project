@org.junit.Test
public void getBoundinBoxLatLongGivenValidCoordinates() {
    latitudeMin = 52.51;
    longitudeMin = 13.2;
    latitudeMax = 52.510005;
    longitudeMax = 13.20005;
    try {
        java.lang.System.out.println("wait 10 secs");
        java.util.concurrent.TimeUnit.SECONDS.sleep(10);
        this.testDocument = de.fh_bielefeld.geograph.API.OSMApi.getBoundingBoxLatLong(latitudeMin, longitudeMin, latitudeMax, longitudeMax);
    } catch (de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException ex) {
        fail("There shouldn't be an InvalidAPIRequestException!");
    } catch (java.lang.InterruptedException ex) {
        ex.printStackTrace();
        fail("fail!");
    }
    assertNotNull(this.testDocument);
}