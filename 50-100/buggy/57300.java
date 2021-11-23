@java.lang.Override
public void run(final java.lang.String... args) throws java.lang.Exception {
    final fr.cavezzan.games.minesweeper.configuration.GameParameter parameters = configurer.configure();
    fr.cavezzan.games.minesweeper.game.runner.CliGameRunner.LOG.debug("The game will be : {}", parameters);
    final fr.cavezzan.games.minesweeper.game.Game game = generator.generate(parameters);
    while ((manager.play(game)) == (fr.cavezzan.games.minesweeper.game.GameManager.GameStatus.CONTINUE)) {
        int attemptNumber = game.getCount();
        game.setCount((attemptNumber++));
    } 
}