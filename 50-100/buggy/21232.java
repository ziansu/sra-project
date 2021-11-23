public web.shop.database.entities.User getUserByLogin(java.lang.String login) {
    web.shop.database.entities.User user = null;
    java.util.List userList = list();
    for (java.lang.Object obj : userList) {
        web.shop.database.entities.User userCandidate = ((web.shop.database.entities.User) (obj));
        if (userCandidate.getLogin().equals(login)) {
            user = userCandidate;
        }
        break;
    }
    return user;
}