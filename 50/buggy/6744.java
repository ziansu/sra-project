private boolean isPlayerTurn(edu.jhu.clueless.Player player) {
    return ((getActive()) && ((winner) == null)) && (player.getSuspect().equals(edu.jhu.clueless.Game.SUSPECT_ORDER[indexPlayerTurn]));
}