public static Rational difference(Rational a, Rational b) {
    return new Rational(a.plus(b.times(new Rational((-1), 1))));
}