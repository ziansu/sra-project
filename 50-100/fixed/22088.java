private boolean isCanSetOnDestination(int locationIndex, org.moshe.arad.game.instrument.BackgammonPawn backgammonPawn) {
    return (((board.get(locationIndex).size()) > 0) && ((board.get(locationIndex).peek()) != null)) && (!(board.get(locationIndex).peek().equals(backgammonPawn))) ? false : true;
}