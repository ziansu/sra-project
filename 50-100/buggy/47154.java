public void render() {
    chu.engine.anim.Transform t = new chu.engine.anim.Transform();
    if (!(left)) {
        t.flipHorizontal();
    }
    chu.engine.anim.Renderer.render(texture, 0, 0, 1, 1, x, y, ((x) + 120), ((y) + 40), 1, t);
}