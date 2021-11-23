public static play.mvc.Result timeSeriesPublicPage(int timeSeriesId) {
    db.ArtifactDAO db = db.ArtifactDAO.getInstance();
    controllers.TimeSeries timeSeriesProps = db.timeSeries(timeSeriesId, null);
    int id = timeSeriesProps.id;
    java.lang.String name = timeSeriesProps.name;
    java.lang.String email = session().get("email");
    controllers.User loggedInUser = null;
    if (email != null) {
        loggedInUser = controllers.User.findByEmail(email);
    }
    return ok(timeseries.render(loggedInUser, id, name, true));
}