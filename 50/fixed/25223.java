@java.lang.Override
public void render(float delta) {
    super.render(delta);
    clearScreen();
    update(delta);
    draw();
}