private boolean isMyFriend(DATA.model.User user) {
    java.util.List<DATA.model.User> users = getFriendGroup().getUsers();
    for (DATA.model.User u : users) {
        return u.getUid().equals(application.currentUser().getUid());
    }
    return false;
}