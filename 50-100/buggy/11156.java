public void updateParticles() {
    if (!(particles.isEmpty())) {
        java.util.ArrayList<com.bmesta.powermode.Particle> tempParticles = new java.util.ArrayList<com.bmesta.powermode.Particle>(particles);
        final java.util.Iterator<com.bmesta.powermode.Particle> particleIterator = tempParticles.iterator();
        while (particleIterator.hasNext()) {
            if (particleIterator.next().update()) {
                particleIterator.remove();
            }
        } 
        particles = tempParticles;
        this.repaint();
    }
}