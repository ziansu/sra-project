@java.lang.Override
public void update(org.newdawn.slick.GameContainer gc, org.newdawn.slick.state.StateBasedGame game, int delta) throws org.newdawn.slick.SlickException {
    if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE)) {
        game.enterState(GameCore.PAUSE_MENU_STATE_ID);
    }
    if (gc.getInput().isKeyPressed(Input.KEY_F3)) {
        ca.qc.bdeb.info204.spellington.gamestates.PlayState.debugMode = !(ca.qc.bdeb.info204.spellington.gamestates.PlayState.debugMode);
    }
    spellington.update(gc.getInput(), delta);
    ca.qc.bdeb.info204.spellington.calculations.Calculations.checkMapCollision(mapCollision, spellington);
}