public void update(float deltaTime) {
    com.badlogic.gdx.ai.GdxAI.getTimepiece().update(deltaTime);
    com.badlogic.gdx.ai.msg.MessageManager.getInstance().update();
    dynamicsWorld.stepSimulation(deltaTime, 10, (1.0F / 240.0F));
    for (com.mygdx.game.GameObject object : objectsById.values()) {
        object.update(deltaTime);
    }
}