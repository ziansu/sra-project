public void init(org.newdawn.slick.GameContainer container, org.newdawn.slick.state.StateBasedGame game) throws org.newdawn.slick.SlickException {
    org.newdawn.slick.Music openingMenuMusic = new org.newdawn.slick.Music("data/music.ogg");
    openingMenuMusic.loop();
    this.game = game;
    resetVariable();
}