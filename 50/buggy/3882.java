public void showSun(gui.GameContainer gc, gui.StateBasedGame sbg, gui.Graphics g) throws gui.SlickException {
    sun.draw(sunPosX, 100, 0.5F, new gui.Color(1, 1, 1, 0.4F));
    sunAni.draw(sunPosX, 100);
}