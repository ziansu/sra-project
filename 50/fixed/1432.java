public void update(float delta) {
    super.update(delta);
    co.uk.epicguru.physics.JPhysics.update(delta);
    FOE.map.update(delta);
}