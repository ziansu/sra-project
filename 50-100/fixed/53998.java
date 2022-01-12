@com.vlad.rest.GET
@com.vlad.rest.Path(value = "/{city}")
public javax.ws.rs.core.Response getWeatherInCity(@com.vlad.rest.PathParam(value = "city")
java.lang.String city) {
    java.util.Map<java.lang.String, java.lang.Object> headers = new java.util.HashMap<java.lang.String, java.lang.Object>();
    headers.put("q", city);
    headers.put("appid", com.vlad.rest.WeatherEndpoint.API_KEY);
    java.lang.String s = ((java.lang.String) (getWeatherTemplate.requestBodyAndHeaders(null, headers)));
    return javax.ws.rs.core.Response.status(200).type(MediaType.TEXT_HTML).entity(s).build();
}