@com.vlad.rest.GET
@com.vlad.rest.Path(value = "/cities")
public javax.ws.rs.core.Response getWeatherInCities(@com.vlad.rest.QueryParam(value = "city")
java.util.List<java.lang.String> cities) {
    java.lang.String s = ((java.lang.String) (getWeatherInCitiesTemplate.requestBodyAndHeaders(cities, null)));
    return javax.ws.rs.core.Response.status(200).type(MediaType.TEXT_PLAIN).entity(s).build();
}