public static java.util.List<java.lang.Integer> createCommonDivisorList(final java.util.Iterator<java.lang.Integer> values) {
    final java.lang.Integer first = values.next();
    final java.util.List<java.lang.Integer> result = se.kth.speech.MathDivisors.createDivisorList(first);
    while (values.hasNext()) {
        final java.lang.Integer next = values.next();
        se.kth.speech.MathDivisors.removeNonDivisors(values, next);
    } 
    return result;
}