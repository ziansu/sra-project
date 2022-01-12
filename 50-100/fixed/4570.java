@javax.ws.rs.GET
@no.ntnu.stud.minvakt.services.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.ArrayList<no.ntnu.stud.minvakt.data.NewsFeedItem> getNewsFeed() {
    if (getSession().isAdmin()) {
        return newsDB.getNewsFeedAdmin();
    }else {
        return newsDB.getNewsFeed(getSession().getUser().getId());
    }
}