@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
@javax.ws.rs.Path(value = "{activityId}/user")
public com.pluralsight.excercise.services.model.User getActivityUser(@javax.ws.rs.PathParam(value = "activityId")
java.lang.String activityId) {
    {
        com.pluralsight.excercise.services.model.Activity activity = activityRepository.findActivity(activityId);
        com.pluralsight.excercise.services.model.User user = activity.getUser();
        return User;
    }
}