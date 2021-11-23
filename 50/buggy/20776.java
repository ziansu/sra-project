@java.lang.Override
public void exit(woohoo.screens.PlayingScreen screen) {
    screen.getEngine().getSystem(woohoo.gameworld.ContactSystem.class).setProcessing(true);
}