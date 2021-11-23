public void render(org.newdawn.slick.GameContainer gc, org.newdawn.slick.Graphics g) {
    playerNameTextField.render(gc, g);
    playerNameTextField.setFocus(true);
    host.draw((((gc.getWidth()) / 2) - 75), (((gc.getHeight()) / 2) + 80));
    playerNameTextField.setFocus(true);
}