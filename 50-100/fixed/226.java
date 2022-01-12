public static Vector3D getForce(Particle3D p1, Particle3D p2, double grav) {
    double m1 = p1.getMass();
    double m2 = p2.getMass();
    Vector3D r = Particle3D.particleSeparation(p1, p2);
    return r.mult(((((-grav) * m1) * m2) / ((r.magSq()) * (r.mag()))));
}