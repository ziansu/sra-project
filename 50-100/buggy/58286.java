@java.lang.Override
public void init(org.newdawn.slick.GameContainer gc, org.newdawn.slick.state.StateBasedGame s) throws org.newdawn.slick.SlickException {
    loadImages();
    loadEnemyUnits();
    initializeCharacters();
    preboss = false;
    inplace = false;
    postboss = false;
    endlevel = false;
    assemble = false;
    timeDeadDroideka = 0;
    deadDroideka = false;
    pickgun = false;
    alreadyPickedGun = false;
    lastTrooperX = 0;
    pickCounter = 0;
    bgX = 0;
    talkCounter = 0;
    randChoice = 0;
    randSet = false;
}