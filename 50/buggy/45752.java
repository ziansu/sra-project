public void setWorld(hillbillies.model.World world) throws java.lang.IllegalStateException {
    if (!(world.isValidPosition(this.getPosition())))
        throw new java.lang.IllegalStateException();
    
    this.world = world;
}