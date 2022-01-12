public static play.mvc.Result save() {
    play.data.Form<models.Game> form = new play.data.Form<models.Game>(models.Game.class).bindFromRequest();
    models.Game game = form.get();
    controllers.GameController.createPlatforms(game);
    controllers.GameController.createDifficulties(game);
    controllers.GameController.createShips(game);
    controllers.GameController.createModes(game);
    controllers.GameController.createStages(game);
    game.save();
    return controllers.GameController.index(game);
}