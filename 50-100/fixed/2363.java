private Player.Solution buildRandomSolution(Player.GameState gs, Player.AI opAI, Player.ScoreEvaluation eval) {
    Player.Solution solution = new Player.Solution(Player.MagicNumbers.SIMULATION_DEPTH);
    Player.GameState newGs = gs.copy();
    for (int i = 0; i < (Player.MagicNumbers.SIMULATION_DEPTH); i++) {
        solution.actions[i] = getRandomAction(gs);
        Player.GameEngine.applyActionWithoutCopy(newGs, solution.actions[i], opAI.compute(gs));
        solution.score += eval.getGameStateScore(gs, i);
    }
    return solution;
}