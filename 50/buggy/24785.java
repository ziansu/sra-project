public void dragStop(com.cardgamedemo.view.actor.CardActor actor, float x, float y) {
    actor.moveToNewPosition(lastCardActorPos);
    Gdx.app.log("Main", actor.getPositionVector().toString());
}