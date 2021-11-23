public static java.math.BigInteger hexagonal(long N) {
    return hackerrank.euler.Euler045.big(N).multiply(hackerrank.euler.Euler045.big(N).multiply(hackerrank.euler.Euler045.big(2)).subtract(hackerrank.euler.Euler045.big(1)));
}