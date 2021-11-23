public void removeParticle(org.tiralab.particles.Particle particle) {
    if (java.lang.Float.isNaN(particle.getPrevX()))
        return ;
    
    this.root.remove(particle);
}