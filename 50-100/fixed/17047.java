@org.junit.Test
public void getBoundinBoxLatLongGivenValidCoordinates() {
    this.latitudeMin = 52.51;
    this.longitudeMin = 13.2;
    this.latitudeMax = 52.510005;
    this.longitudeMax = 13.20005;
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