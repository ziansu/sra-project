public static void main(java.lang.String[] args) {
    Model.World model = new Model.World(Model.Constants.SCREEN_WIDTH, Model.Constants.SCREEN_HEIGHT);
    Controller.StateViewInit view = new Controller.StateViewInit(Model.Constants.GAME_TITLE, Model.Constants.RUN_IN_FULLSCREEN, Model.Constants.GAME_GRAB_MOUSE, Model.Constants.TARGET_FRAMERATE, ((int) (Model.Constants.WORLD_WIDTH)), ((int) (Model.Constants.WORLD_HEIGHT)));
    new Controller.Controller(view, model).run();
    view.run();
}