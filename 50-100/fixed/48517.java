public static play.mvc.Result getSolvedProblems(java.lang.String username) {
    models.User user = User.find.where().eq("name", username).findUnique();
    if (user == null) {
        return restJsonResponse(1, "User not found");
    }
    return restJsonResponse(0, user.getSolvedProblems());
}