private void flock(java.util.ArrayList<personalproject.simpleapp.Boid> boids) {
    personalproject.simpleapp.Vector2 sep = seperate(boids);
    personalproject.simpleapp.Vector2 ali = align(boids);
    personalproject.simpleapp.Vector2 coh = cohesion(boids);
    sep.multi(data.getSWeight());
    ali.multi(data.getAWeight());
    coh.multi(data.getCWeight());
    applyForce(sep);
    applyForce(coh);
}