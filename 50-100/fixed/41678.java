@java.lang.Override
public void levelLost() {
    if (firstPass) {
        final nl.tudelft.jpacman.level.IdentifiedPlayer player = getPlayers().get(0);
        nl.tudelft.jpacman.game.HallOfFame.setIsNotATest(true);
        try {
            player.saveScore();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        new nl.tudelft.jpacman.game.HallOfFame().handleHoF(player.getScore(), player.getPlayerName());
    }
    stop();
    firstPass = false;
}