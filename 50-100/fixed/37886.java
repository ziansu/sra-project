@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/getfriendsonmap")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public java.lang.String getFriendsOnMap(@javax.ws.rs.FormParam(value = "userid")
int userId, @javax.ws.rs.FormParam(value = "lat1")
double lat1, @javax.ws.rs.FormParam(value = "lon1")
double lon1, @javax.ws.rs.FormParam(value = "lat2")
double lat2, @javax.ws.rs.FormParam(value = "lon2")
double lon2) {
    org.boon.json.ObjectMapper mapper = org.boon.json.JsonFactory.create();
    java.lang.String jsonString = mapper.toJson(com.models.user.UserController.getFriendsOnMap(userId, lat1, lon1, lat2, lon2));
    return jsonString;
}