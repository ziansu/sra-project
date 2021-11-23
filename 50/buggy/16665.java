private static GameEngine.Loader getInstance() {
    if ((Constants.theLoader) == null) {
        Constants.theLoader = new GameEngine.Loader();
    }
    return Constants.theLoader;
}