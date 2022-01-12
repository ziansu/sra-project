public void update(int delta) {
    ctTransform.rotateEuler(0.0F, (((float) (java.lang.Math.PI)) / 1000.0F), 0.0F);
    game.Scene.update(delta);
    renderer.beginDrawing();
    game.Scene.render(delta);
    renderer.endDrawing();
}