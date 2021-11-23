public double poolVolumen() {
    double zVolumen = (((z1.volumen()) / 2) + ((z2.volumen()) / 2)) + ((z3.volumen()) / 2);
    double qVolumen = q.volumen();
    return zVolumen + qVolumen;
}