@java.lang.Override
public boolean ruleIsApplicable() {
    if ((((card1.isTheSameSuit(card2)) && (card1.getRank().equals("A"))) || ((card2.getRank().equals("A")) && (card2.getRank().matches(org.leanpoker.player.holecards.SuitedAces.PATTERN)))) || (card1.getRank().matches(org.leanpoker.player.holecards.SuitedAces.PATTERN))) {
        return true;
    }
    return false;
}