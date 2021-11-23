public mvc.User getOwner() {
    if (((owner) == null) && ((ownerID) != null)) {
        mvc.User loggedIn = mvc.AppUserSingleton.getInstance().getUser();
        if ((loggedIn != null) && (loggedIn.getName().equals(ownerID))) {
            owner = loggedIn;
        }
        if ((owner) == null) {
            owner = getDataSource().getUser(ownerID);
        }
    }
    return owner;
}