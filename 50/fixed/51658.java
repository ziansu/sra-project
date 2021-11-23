public void addTranslation(com.badlogic.gdx.math.Vector2 translate) {
    translation.sub(translate.x, translate.y, 0);
    cam.translate(translate);
    cam.update();
}