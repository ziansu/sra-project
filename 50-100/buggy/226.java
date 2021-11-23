public static Vector3D getForce(Particle3D p1, Particle3D p2, Vector3D f) {
    double m1 = p1.getMass();
    double m2 = p2.getMass();
    double grav = 1;
    Vector3D r = Particle3D.particleSeparation(p1, p2);
    f.copy(r.mult(((((-grav) * m1) * m2) / ((r.magSq()) * (r.mag())))));
    return f;
}