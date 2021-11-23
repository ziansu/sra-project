public mvc.User getBidder() {
    if ((bidder) == null) {
        mvc.User loggedIn = mvc.AppUserSingleton.getInstance().getUser();
        if ((loggedIn != null) && (bidderID.equals(loggedIn.getName()))) {
            bidder = loggedIn;
        }
        if ((bidder) == null) {
            bidder = getDataSource().getUser(bidderID);
        }
    }
    return bidder;
}