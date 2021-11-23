@org.junit.Test(expected = com.tsystems.jschool.railage.service.exceptions.DuplicatedStationsInRouteException.class)
public void testValidateStations() throws java.lang.Exception {
    params.setStationsIds(java.util.Arrays.asList(1, 2, 378, 9009, 678, 89, 902, 89));
    params.validateStations();
}