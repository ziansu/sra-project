private static void show(ai.neat.jneat.Network net) {
    double sum = 0;
    game.Game game = new game.Game(new game.GameState(null), ai.neat.NeatTrainer.gameArgs);
    game.state = new game.GameState(game.state.map);
    game.player1 = new ai.neat.NaiveNeatAI(net);
    game.player2 = new ai.RandomAI(ai.util.RAND_METHOD.TREE);
    game.ui = new ui.UI(game.state, false, false);
    game.run();
    double val = game.state.getWinner();
    sum += ai.neat.NeatTrainer.score(1, val);
}