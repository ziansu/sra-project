protected void addLikeOnClickHandler(android.view.View v) {
    isep.moodup.Incident item = ((isep.moodup.Incident) (v.getTag()));
    session = new isep.moodup.SessionManager(getApplicationContext());
    java.util.HashMap<java.lang.String, java.lang.String> user = session.getUserDetails();
    final java.lang.String idUser = user.get(Config.KEY_USER_ID);
    final java.lang.String idIncident = item.getId();
    addLike(idIncident, idUser);
}