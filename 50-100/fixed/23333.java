private boolean isMyFriend(DATA.model.User user) {
    java.util.List<DATA.model.User> users = getFriendGroup().getUsers();
    for (DATA.model.User u : users) {
        if (u.getUid().equals(user.getUid())) {
            return true;
        }
    }
    return false;
}