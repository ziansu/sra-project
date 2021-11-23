@java.lang.Override
public void update() {
    super.update();
    if (!(hasDissolved)) {
        java.util.List<katsu.KEntity> entities = getRoom().findEntitiesAtPoint(getX(), getY());
        for (katsu.KEntity e : entities) {
            e.setSolid(false);
        }
        hasDissolved = true;
    }
}