private traer.physics.Particle createParticle(int x, int y) {
    traer.physics.Particle newParticle = m_particleSystem.makeParticle(campaignencyclopedia.display.swing.graphical.CampaignEntityGraphCanvas.PARTICLE_MASS, x, y, 0);
    for (int i = 0; i < (m_particleSystem.numberOfParticles()); i++) {
        traer.physics.Particle p = m_particleSystem.getParticle(i);
        if (p.equals(newParticle)) {
            continue;
        }
        m_particleSystem.makeAttraction(p, newParticle, campaignencyclopedia.display.swing.graphical.CampaignEntityGraphCanvas.REPULSIVE_FORCE, campaignencyclopedia.display.swing.graphical.CampaignEntityGraphCanvas.MIN_REPULSIVE_DISTANCE);
    }
    return newParticle;
}