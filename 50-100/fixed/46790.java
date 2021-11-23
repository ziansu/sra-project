@java.lang.Override
public void setScreen(com.teamturtle.infinityrun.InfinityRun.ScreenID screen) throws java.lang.Exception {
    com.teamturtle.infinityrun.screens.AbstractScreen newScreen;
    switch (screen) {
        case MAIN_MENU :
            newScreen = new com.teamturtle.infinityrun.screens.StartScreen(getSpriteBatch(), this);
            break;
        case GAME :
            newScreen = new com.teamturtle.infinityrun.screens.GameScreen(getSpriteBatch(), this);
            break;
        default :
            throw new java.lang.Exception("Unknown screen enum");
    }
    com.badlogic.gdx.Screen oldScreen = getScreen();
    newScreen.buildStage();
    setScreen(newScreen);
    oldScreen.dispose();
}