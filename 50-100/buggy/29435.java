private static void loadPlayerState() {
    try (java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.FileInputStream(br.com.canoza.repository.PlayerRepository.PLAYERS_DAT))) {
        br.com.canoza.repository.PlayerRepository.players = ((java.util.HashMap<java.lang.String, br.com.canoza.domain.model.Player>) (objectInputStream.readObject()));
    } catch (java.io.IOException ex) {
        throw new br.com.canoza.exception.SnakeWayException("Could not load Player State", ex);
    }
}