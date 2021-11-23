@javax.ws.rs.GET
@no.ntnu.stud.minvakt.services.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public no.ntnu.stud.minvakt.data.NewsFeedItem getNewsFeed() {
    if (getSession().isAdmin()) {
        return newsDB.getNewsFeedAdmin().get(0);
    }else {
        return newsDB.getNewsFeed(getSession().getUser().getId()).get(0);
    }
}