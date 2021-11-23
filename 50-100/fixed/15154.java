public void nextLevel() {
    if (levelIt.hasNext()) {
        resetPlayers();
        int score = ((getCurLevel().getTime()) / (getCurLevel().getMaxTime())) * 500;
        for (nl.tudelft.model.Player player : players) {
            player.setScore(((player.getScore()) + score));
        }
        setCurLevel(levelIt.next());
    }else {
        gameCompleted();
    }
}