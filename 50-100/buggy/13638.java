public net.dv8tion.jda.core.entities.User getPlayer(java.lang.String playerName) throws main.java.exceptions.PlayerNotFoundException {
    for (net.dv8tion.jda.core.entities.User u : players) {
        if ((u.getName().toLowerCase()) == (playerName.toLowerCase())) {
            return u;
        }
    }
    throw new main.java.exceptions.PlayerNotFoundException();
}