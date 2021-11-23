public void hit() {
    this.setActive(false);
    data.getUniverse().removeGameEntity(this);
    data.getLevels().get(0).end();
}