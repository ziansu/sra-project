@java.lang.Override
public int apply() {
    java.util.Map<java.lang.String, java.lang.Integer> rankMap = new java.util.HashMap<>();
    java.lang.String curRank = null;
    for (org.leanpoker.player.model.Card cur : state.getOurPokerBot().getHole_cards()) {
        curRank = cur.getRank();
        if (rankMap.containsKey(curRank)) {
            return descision.getRaise();
        }
    }
    return descision.getFold();
}