public user.User isUser(java.lang.String login, java.lang.String mdp) {
    if ((user.GestionUsers.users) == null) {
        return null;
    }
    for (user.User user : user.GestionUsers.users) {
        if ((user.getLogin().equals(login)) && (user.getMdp().equals(mdp))) {
            return user;
        }
    }
    return null;
}