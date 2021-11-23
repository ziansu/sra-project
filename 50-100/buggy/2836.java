@org.junit.Test
public void getBoundingBoxOfRangeGivenSameCoordinates() {
    latitude = 51.9032375;
    longitude = 51.9032375;
    range = 0.1;
    try {
        java.lang.System.out.println("wait 10 secs");
        java.util.concurrent.TimeUnit.SECONDS.sleep(10);
        this.testDocument = de.fh_bielefeld.geograph.API.OSMApi.getBoundingBoxOfRange(latitude, longitude, range);
    } catch (de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException ex) {
        fail("There shouldn't be an InvalidAPIRequesException");
    } catch (java.lang.InterruptedException ex) {
        ex.printStackTrace();
        fail("fail!");
    }
    assertNotNull(this.testDocument);
}