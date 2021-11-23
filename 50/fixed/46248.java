@java.lang.Override
public java.util.List<my.project.autodealer.services.Advert> getAdvertsByPageForUser(int currentPage, int advertsOnPage, my.project.autodealer.services.User user) {
    return databaseManager.loadAdvertsByPageForUser((currentPage * advertsOnPage), advertsOnPage, user);
}