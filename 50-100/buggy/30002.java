public double poolVolumen() {
    double zVolumen = (((z1.volumen()) + (z2.volumen())) + (z3.volumen())) / 2;
    double qVolumen = q.volumen();
    java.lang.System.out.println((zVolumen + qVolumen));
    return zVolumen + qVolumen;
}