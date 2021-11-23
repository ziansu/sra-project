private boolean unitIsLocated(edu.cwru.sepia.util.Pair<java.lang.Integer, java.lang.Integer> location) {
    for (edu.cwru.sepia.agent.minimax.GameState.SimpleUnit footman : footmen) {
        if (footman.getLocation().equals(location)) {
            return true;
        }
    }
    for (edu.cwru.sepia.agent.minimax.GameState.SimpleUnit archer : archers) {
        if (archer.getLocation().equals(location)) {
            return true;
        }
    }
    return false;
}