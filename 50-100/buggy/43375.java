public user.User isUser(java.lang.String login, java.lang.String mdp) {
    for (user.User user : user.GestionUsers.users) {
        if ((user.getLogin().equals(login)) && (user.getMdp().equals(mdp))) {
            return user;
        }
    }
    return null;
}