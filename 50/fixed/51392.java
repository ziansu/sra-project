public void removeParticle(org.tiralab.particles.Particle particle) {
    if ((this.root) == null)
        return ;
    
    this.root.remove(particle);
}