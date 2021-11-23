@java.lang.Override
public void update() {
    super.update();
    if (!(world.isRemote)) {
        emptyContainer();
        fillContainer();
        tank.compareAndUpdate();
    }
}