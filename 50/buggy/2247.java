@java.lang.Override
public void render() {
    if ((game) == null) {
        bgLayer.render();
        mainLayer.render();
    }else {
        game.render();
    }
}