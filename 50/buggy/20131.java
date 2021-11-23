public static java.math.BigInteger triangle(long N) {
    return hackerrank.euler.Euler045.big(N).multiply(hackerrank.euler.Euler045.big(N).add(hackerrank.euler.Euler045.big(1))).divide(hackerrank.euler.Euler045.big(2));
}