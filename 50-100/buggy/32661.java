@com.vlad.rest.GET
@com.vlad.rest.Path(value = "/cities")
public javax.ws.rs.core.Response getWeatherInCities(@com.vlad.rest.QueryParam(value = "city")
java.util.List<java.lang.String> cities) {
    java.util.Map<java.lang.String, java.lang.Object> headers = new java.util.HashMap<java.lang.String, java.lang.Object>();
    headers.put("q", "ad");
    headers.put("appid", com.vlad.rest.WeatherEndpoint.API_KEY);
    java.util.ArrayList s = ((java.util.ArrayList) (getWeatherInCitiesTemplate.requestBodyAndHeaders(cities, null)));
    return javax.ws.rs.core.Response.status(200).type(MediaType.TEXT_PLAIN).entity(s.toString()).build();
}