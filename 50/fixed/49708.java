public void act() {
    if (Greenfoot.mouseClicked(this)) {
        BaseGraph world = ((BaseGraph) (getWorld()));
        world.setCountryColor(id);
    }
}