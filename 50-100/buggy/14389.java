private void maybeFixMousePos() {
    int mouseX = Gdx.input.getX();
    int mouseY = Gdx.input.getY();
    int w = Gdx.graphics.getWidth();
    int h = Gdx.graphics.getHeight();
    mouseX = ((int) (com.miloshpetrov.sol2.common.SolMath.clamp(mouseX, 0, w)));
    mouseY = ((int) (com.miloshpetrov.sol2.common.SolMath.clamp(mouseY, 0, h)));
    Gdx.input.setCursorPosition(mouseX, (h - mouseY));
}