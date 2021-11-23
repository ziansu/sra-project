@play.mvc.Security.Authenticated(value = controllers.Secured.class)
public static play.mvc.Result timeSeriesPage(int timeSeriesId) {
    db.ArtifactDAO db = db.ArtifactDAO.getInstance();
    controllers.User loggedInUser = controllers.User.findByEmail(request().username());
    controllers.TimeSeries timeSeriesProps = db.timeSeries(timeSeriesId, loggedInUser.email);
    int id = timeSeriesProps.id;
    java.lang.String name = timeSeriesProps.name;
    return ok(timeseries.render(loggedInUser, id, name, false));
}