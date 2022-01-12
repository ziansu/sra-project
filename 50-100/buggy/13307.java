private static double evaluate(player.Player.TronSimulator engine, player.Player.Spot startAt, player.Player.ActionsType[] actions) {
    double score = 0;
    for (player.Player.ActionsType action : actions) {
        if (engine.perform(startAt, action)) {
            break;
        }
        score += 1.0;
    }
    return score / (actions.length);
}