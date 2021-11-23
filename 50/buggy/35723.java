public void render(org.newdawn.slick.GameContainer container, org.newdawn.slick.Graphics g) throws org.newdawn.slick.SlickException {
    synchronized(objects) {
        for (game_object.GameObject object : objects) {
            object.render(container, g);
        }
    }
}