public void render(org.newdawn.slick.GameContainer gc, org.newdawn.slick.Graphics g) throws org.newdawn.slick.SlickException {
    g.scale(main.Main.SCALE, main.Main.SCALE);
    main.World.render(gc, g);
    g.scale((1.0F / (main.Main.SCALE)), (1.0F / (main.Main.SCALE)));
    g.setFont(((java.awt.Font) (main.Main.fontLarge)));
    main.Text.render(g);
}