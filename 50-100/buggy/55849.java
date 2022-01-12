public void dragStart(com.cardgamedemo.view.actor.CardActor actor, float x, float y) {
    lastCardActorPos = actor.getPositionVector();
    Gdx.app.log("Main", lastCardActorPos.toString());
    com.badlogic.gdx.math.Vector2 coords = actor.localToParentCoordinates(new com.badlogic.gdx.math.Vector2(x, y));
    dragOffsetX = (coords.x) - (actor.getX());
    dragOffsetY = (coords.y) - (actor.getY());
}