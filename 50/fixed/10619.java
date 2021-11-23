@org.junit.Test
public void unitTest_getAllPlayers_noPacman() {
    java.util.List<com.pm.server.player.Pacman> pacmanReturnedList = pacmanRepository.getAllPlayers();
    org.junit.Assert.assertTrue(pacmanReturnedList.isEmpty());
}