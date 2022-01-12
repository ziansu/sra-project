void zoomIn() {
    int yPos = Gdx.graphics.getHeight();
    yPos -= 70;
    for (com.badlogic.gdx.scenes.scene2d.Actor actor : getChildren()) {
        aurelienribon.tweenengine.Tween.to(actor, ActorAccessor.POSITION, 1.5F).delay(random.nextFloat()).target(centerX(Gdx.graphics.getWidth(), actor.getWidth()), yPos).start(tweenManager);
        yPos -= (actor.getHeight()) + 5;
    }
}