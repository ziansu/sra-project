public double period(double ab, double ac, double bc) {
    ab = this.distance(this.a, this.b);
    ac = this.distance(this.a, this.c);
    bc = this.distance(this.b, this.c);
    return ((ab + ac) + bc) / 2;
}