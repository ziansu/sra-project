public io.github.galaipa.sbb.ArenaPlayer getPlayer(int id) {
    for (io.github.galaipa.sbb.ArenaPlayer j : players) {
        if ((j.getID()) == id) {
            return j;
        }
    }
    return null;
}