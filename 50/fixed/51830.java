public void update(org.newdawn.slick.GameContainer gameContainer, org.newdawn.slick.state.StateBasedGame stateBasedGame, int i) throws org.newdawn.slick.SlickException {
    for (states.Updatable u : updatables) {
        u.update(this);
    }
}