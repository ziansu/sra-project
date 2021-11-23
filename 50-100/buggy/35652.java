public static com.playposse.egoeater.backend.beans.UserBean updateLocation(long sessionId, double longitude, double latitude, java.lang.String city, java.lang.String state, java.lang.String country) throws com.google.api.server.spi.response.BadRequestException {
    com.playposse.egoeater.backend.schema.EgoEaterUser egoEaterUser = loadUser(sessionId);
    egoEaterUser.setLatitude(latitude);
    egoEaterUser.setLongitude(longitude);
    egoEaterUser.setCity(city);
    egoEaterUser.setState(state);
    egoEaterUser.setCountry(country);
    com.googlecode.objectify.ObjectifyService.ofy().save().entity(egoEaterUser).now();
    return new com.playposse.egoeater.backend.beans.UserBean(egoEaterUser);
}