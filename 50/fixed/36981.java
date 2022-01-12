public void addNick(java.lang.String nick, io.github.likcoras.agar.auth.AuthLevel level) {
    nicks.put(nick.toLowerCase(), level);
    writeNicks();
}