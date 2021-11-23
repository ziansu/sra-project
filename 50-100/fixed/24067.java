public void interact(double dt, waveequation.Particle prev, waveequation.Particle next) {
    double average = ((prev.y) + (next.y)) / 2;
    double k1 = (y) - average;
    vy -= (((waveequation.Particle.strength) + (((waveequation.Particle.damp) * (java.lang.Math.signum(k1))) * (vy))) * dt) * k1;
}