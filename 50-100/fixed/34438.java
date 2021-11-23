public java.util.List<com.mygdx.gravitytoy.vc.ParticleInformation> update(float delta) {
    java.util.List<com.mygdx.gravitytoy.vc.ParticleInformation> ans = new java.util.ArrayList<com.mygdx.gravitytoy.vc.ParticleInformation>();
    applyCollisions();
    integrateForces();
    applyForces(delta);
    for (com.mygdx.gravitytoy.simulation.Particle p : particles) {
        ans.add(new com.mygdx.gravitytoy.vc.ParticleInformation(p));
    }
    return ans;
}