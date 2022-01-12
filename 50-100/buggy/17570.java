@java.lang.Override
public java.util.List<com.pm.server.player.Pacman> getAllPlayers() {
    if ((pacman) == null) {
        com.pm.server.repository.PacmanRepositoryImpl.log.debug("Retrieving Pacman: null");
        return null;
    }
    java.util.List<com.pm.server.player.Pacman> pacmanList = new java.util.ArrayList<com.pm.server.player.Pacman>();
    pacmanList.add(pacman);
    return pacmanList;
}