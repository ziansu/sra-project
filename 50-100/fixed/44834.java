public void step(org.openpixi.pixi.physics.particles.IParticle p, org.openpixi.pixi.physics.force.Force f, double dt) {
    org.openpixi.pixi.physics.particles.CGCParticle P = ((org.openpixi.pixi.physics.particles.CGCParticle) (p));
    for (int i = 0; i < (P.pos0.length); i++) {
        P.pos1[i] = (P.pos0[i]) + ((P.vel[i]) * dt);
    }
    P.Q1 = P.Q0.act(P.U.adj());
}