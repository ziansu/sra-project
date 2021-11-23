@java.lang.Override
public void render(float dt) {
    Curling.batch.begin();
    for (com.coursework.curling.models.PhysicalEntity s : manager.getStones()) {
        s.getSprite().draw(Curling.batch);
    }
    Curling.batch.end();
}