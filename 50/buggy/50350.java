@java.lang.Override
public void addToWorld(jumpingalien.model.World world) {
    if (((this.world) == null) && (canHaveAsWorld(world))) {
        this.world = world;
        world.addShark(this);
    }
}