public void hit() {
    this.setActive(false);
    data.getLevels().get(0).end();
    data.getUniverse().removeGameEntity(this);
}