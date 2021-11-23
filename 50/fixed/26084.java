public void remNick(java.lang.String nick) {
    io.github.likcoras.agar.auth.AuthLevel level = nicks.remove(nick.toLowerCase());
    if (level != null) {
        writeNicks();
    }
}