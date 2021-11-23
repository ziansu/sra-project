public static void index() {
    controllers.Http.Cookie userLoggedInCookie = request.cookies.get("token");
    if ((userLoggedInCookie == null) || ((models.User.find("byToken", userLoggedInCookie.value).first()) == null)) {
        controllers.Application.loginForm();
    }
    models.User user = models.User.find("byToken", userLoggedInCookie.value).first();
    java.util.List<models.Audio> audios = models.Audio.find("byUser", user).fetch();
    render(audios);
}