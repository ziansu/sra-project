public void init(com.badlogic.gdx.math.Vector2 position, com.badlogic.gdx.math.Vector2 size) {
    if (uk.co.redfruit.gdx.skyisfalling.utils.Constants.DEBUG) {
        Gdx.app.log(uk.co.redfruit.gdx.skyisfalling.game.objects.Explosion.TAG, ("Explosion length: " + (animation.getAnimationDuration())));
    }
    this.position = position;
    this.size = size;
    loader = null;
    defaultDynamicBodyDef = null;
}