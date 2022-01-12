public void showScreen(com.teamturtle.infinityrun.InfinityRun.ScreenID screen) throws java.lang.Exception {
    com.teamturtle.infinityrun.screens.AbstractScreen newScreen;
    switch (screen) {
        case MAIN_MENU :
            newScreen = new com.teamturtle.infinityrun.screens.StartScreen(getSpriteBatch());
            break;
        case GAME :
            newScreen = new com.teamturtle.infinityrun.screens.GameScreen(getSpriteBatch());
            break;
        default :
            throw new java.lang.Exception("Unknown screen enum");
    }
    com.badlogic.gdx.Screen oldScreen = getScreen();
    newScreen.buildStage();
    setScreen(newScreen);
    oldScreen.dispose();
}