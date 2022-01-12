@java.lang.Override
protected void onCreateScreens(com.jukusoft.rpgcreator.engine.screen.ScreenManager<com.jukusoft.rpgcreator.engine.screen.IScreen> screenManager) {
    screenManager.addScreen("intro", new com.jukusoft.rpgcreator.engine.screen.impl.IntroScreen());
}