@java.lang.Override
public void enteringState(java.lang.String previousStateName) {
    background = new se.chalmers.get_rect.game.entities.EntityManager();
    foreground = new se.chalmers.get_rect.game.entities.EntityManager();
    physics = new se.chalmers.get_rect.physics.FrostbiteEngine();
    physics.add(playerController);
    se.chalmers.get_rect.game.loaders.SceneLoader loader = new se.chalmers.get_rect.game.loaders.SceneLoader("test", playerController, rectangleFactory);
    try {
        loadZombies(loader);
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.out.println(e.getMessage());
    }
    playerController.setPosition(200, 90);
    foreground.add(playerController);
}