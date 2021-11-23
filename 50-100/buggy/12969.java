@ninja.FilterWith(value = www.purple.mixxy.filters.JsonEndpoint.class)
public ninja.Result comic(@ninja.params.PathParam(value = "user")
java.lang.String user, @ninja.params.PathParam(value = "work")
java.lang.String work) {
    www.purple.mixxy.models.User username = userDao.getUser(user);
    www.purple.mixxy.models.Comic comic = comicDao.getComic(username, work);
    if ((username == null) || (comic == null)) {
        return ninja.Results.notFound().template(("www/purple/mixxy/" + (ninja.utils.NinjaConstant.LOCATION_VIEW_FTL_HTML_NOT_FOUND)));
    }
    return ninja.Results.ok().render("comic", comic).render("user", user).html();
}