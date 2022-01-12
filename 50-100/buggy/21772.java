public net.megaroid.math.Rational add(net.megaroid.math.Rational r) {
    int gcd = net.megaroid.math.GCD.gcd(m, n);
    int m1 = ((m) / gcd) * (r.m);
    int n1 = ((n) * (m1 / (m))) + ((r.n) * (m1 / (r.m)));
    net.megaroid.math.Rational r1 = new net.megaroid.math.Rational(n1, m1);
    return r1.reduced();
}