public java.util.ArrayList<io.scoober.ulti.ulti_mate.Game> getActiveGames(int numGames, int offset) {
    io.scoober.ulti.ulti_mate.Game[] statuses = new Game.Status[]{ Game.Status.NOT_STARTED , Game.Status.FIRST_HALF , Game.Status.HALFTIME , Game.Status.SECOND_HALF , Game.Status.SOFT_CAP , Game.Status.HARD_CAP , Game.Status.IN_PROGRESS };
    return getRecentGames(numGames, offset, statuses);
}