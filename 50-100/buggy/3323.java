public org.tiralab.particles.Particle[] getObjectsAtArea(float x, float y, float w, float h) {
    org.tiralab.particles.ParticleSet set = new org.tiralab.particles.ParticleSet();
    this.root.get(set, x, y, w, h);
    return set.toArray();
}