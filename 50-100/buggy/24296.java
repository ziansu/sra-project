public void createCloneOf(Scratch actor) {
    java.lang.Object clone = callConstructor(actor);
    getWorld().addObject(((Scratch) (clone)), translateToGreenfootX(actor.getX()), translateToGreenfootY(actor.getY()));
    getWorld().registerActivateClone(clone);
}