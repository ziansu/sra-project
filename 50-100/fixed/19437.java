private net.demilich.metastone.game.behaviour.aiplanner.NBestQueue planTurn(net.demilich.metastone.game.behaviour.aiplanner.Node node) {
    int playerId = node.state.getActivePlayerId();
    if ((node.state.getTurnState()) == (net.demilich.metastone.game.TurnState.TURN_ENDED)) {
        node.state.startTurn(playerId);
    }
    java.util.List<net.demilich.metastone.game.actions.GameAction> actions = node.state.getValidActions();
    net.demilich.metastone.game.behaviour.aiplanner.NBestQueue outcomes = search.search(node.state, playerId, actions);
    return outcomes;
}