public void render() {
    com.badlogic.gdx.math.Vector2 pos = com.sgstudio.utils.Box2DHelper.getPosition(com.sgstudio.game.train.Locomotive.body);
    com.sgstudio.game.train.Locomotive.batch.draw(com.sgstudio.game.train.Locomotive.sprite, ((pos.x) - ((com.sgstudio.game.train.Locomotive.sprite.getWidth()) / 2)), (((pos.y) - ((com.sgstudio.game.train.Locomotive.sprite.getHeight()) / 2)) + 285));
}