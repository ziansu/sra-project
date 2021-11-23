@java.lang.Override
public int apply() {
    org.leanpoker.player.rules.Map<java.lang.String, java.lang.Integer> rankMap = new org.leanpoker.player.rules.HashMap();
    java.lang.String curRank = null;
    for (org.leanpoker.player.model.Card cur : state.getOurPokerBot().getHole_cards()) {
        curRank = cur.getRank();
        if (rankMap.containsKey(curRank)) {
            return descision.getRaise();
        }
    }
    return descision.getFold();
}