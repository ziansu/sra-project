@org.junit.Test
public void getBoundingBoxOfRangeGivenValidArguments() {
    latitude = 51.9032375;
    longitude = 8.3857535;
    range = 0.003;
    try {
        java.lang.System.out.println("wait 10 secs");
        java.util.concurrent.TimeUnit.SECONDS.sleep(10);
        this.testDocument = de.fh_bielefeld.geograph.API.OSMApi.getBoundingBoxOfRange(latitude, longitude, range);
    } catch (de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException ex) {
        fail("There shouldn't be an InvalidAPIRequestException!");
    } catch (java.lang.InterruptedException ex) {
        ex.printStackTrace();
        fail("fail!");
    }
    assertNotNull(this.testDocument);
}