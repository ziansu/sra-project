@java.lang.Override
public void render(float dt) {
    for (com.coursework.curling.models.PhysicalEntity s : manager.getStones()) {
        s.getSprite().draw(Curling.batch);
    }
}