@java.lang.Override
public void update() {
    super.update();
    if (!(hasDissolved)) {
        java.util.List<katsu.KEntity> entities = getRoom().findEntitiesAtPoint(((getX()) + 1), ((getY()) + 1));
        for (katsu.KEntity e : entities) {
            e.setSolid(false);
        }
        hasDissolved = true;
    }
}