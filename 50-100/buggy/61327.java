private static void init() {
    game.Game.running = true;
    game.Game.display = new game.Display(game.Game.WIDTH, game.Game.HEIGHT);
    game.Game.state = game.Game.GameState.RUNNING;
    game.InputManager.addButton(game.Game.button);
    game.Game.encounter = new encounter.Encounter(new world.World(null, 0), "This is a test foar encounters", new encounter.Solution[]{ new game.Game.testSolution() , new game.Game.testSolution() });
    game.Game.encounter.startEncounter();
}