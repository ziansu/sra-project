@javax.ws.rs.GET
public java.util.ArrayList<no.ntnu.stud.minvakt.data.NewsFeedItem> getNewsFeed() {
    if (getSession().isAdmin()) {
        return newsDB.getNewsFeedAdmin();
    }else {
        return newsDB.getNewsFeed(getSession().getUser().getId());
    }
}