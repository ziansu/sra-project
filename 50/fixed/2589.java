public void render(org.newdawn.slick.GameContainer container, org.newdawn.slick.state.StateBasedGame game, org.newdawn.slick.Graphics g) throws org.newdawn.slick.SlickException {
    this.map.render(g);
    for (graphique.Player p : _players)
        p.render(g);
    
    this.hud.render(g);
}