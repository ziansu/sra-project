private static int sumProperDivisors(int num) {
    return (be.inniger.euler.util.Maths.getDivisors(num).stream().mapToInt(java.lang.Long::intValue).sum()) - num;
}