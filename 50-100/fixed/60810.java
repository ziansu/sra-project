@java.lang.Override
public void execute() {
    float x;
    float y;
    x = entity.Entity.xToGrid(entity.Entity.gridToX());
    y = entity.Entity.xToGrid(entity.Entity.gridToY());
    for (entity.Entity e : ref.updater.selected) {
        if (trainerClass.isAssignableFrom(e.getClass())) {
            e.sendAnimation(((("setTarget " + x) + " ") + y));
        }
    }
}