public static play.mvc.Result tracks() {
    play.data.Form<models.TrackRegistration> form = play.data.Form.form(models.TrackRegistration.class).bindFromRequest();
    java.lang.String currentUserAddress = models.utility.AST.getUserAddress();
    controllers.Tracks.getTrack();
    return ok(views.html.member.tracks.render(form, currentUserAddress));
}