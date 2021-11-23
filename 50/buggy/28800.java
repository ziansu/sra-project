public void setRace(Race race) {
    game = race;
    java.lang.System.out.println(("race: " + (game.getName())));
    if (game.hasMap()) {
    }
    playGame();
}