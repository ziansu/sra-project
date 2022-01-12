public void render(org.newdawn.slick.GameContainer container, org.newdawn.slick.Graphics g) throws org.newdawn.slick.SlickException {
    if (paused) {
        pauseScreen.render(container, g);
    }else {
        currentRoom.render(container, g);
        player.render(container, g);
    }
}