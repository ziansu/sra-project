@java.lang.Override
public com.hearthsim.util.tree.HearthTreeNode minionSummonEvent(com.hearthsim.model.PlayerSide thisMinionPlayerSide, com.hearthsim.model.PlayerSide summonedMinionPlayerSide, com.hearthsim.card.minion.Minion summonedMinion, com.hearthsim.util.tree.HearthTreeNode boardState) {
    if (!(com.hearthsim.card.goblinsvsgnomes.minion.common.ShipsCannon.triggerFilter.targetMatches(thisMinionPlayerSide, this, summonedMinionPlayerSide, summonedMinion, boardState.data_))) {
        return boardState;
    }
    java.util.Collection<com.hearthsim.util.tree.HearthTreeNode> rngChildren = this.effectRandomCharacterUsingFilter(com.hearthsim.card.goblinsvsgnomes.minion.common.ShipsCannon.effect, null, com.hearthsim.card.goblinsvsgnomes.minion.common.ShipsCannon.effectFilter, summonedMinionPlayerSide, boardState);
    return this.createRngNodeWithChildren(boardState, rngChildren);
}