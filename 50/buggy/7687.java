public void update(org.newdawn.slick.GameContainer gc, int delta) throws org.newdawn.slick.SlickException {
    clientObject.update(gc, delta);
    currentInputState = collectInputState(delta, clientObject.getId());
}