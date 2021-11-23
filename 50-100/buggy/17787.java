@org.junit.Test
public void gpTravelModeTest() throws java.lang.Exception {
    com.google.maps.model.DirectionsRoute[] routes = gpDirectionsService.newRequest().mode(TravelMode.WALKING).origin("Via Provinciale, Marsicovetere").destination("Via Nazionale, Marsicovetere").await();
    assertNotNull(routes);
    assertEquals(TravelMode.WALKING, routes[0].legs[0].steps[0].travelMode);
}