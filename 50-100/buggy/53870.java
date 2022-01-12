@java.lang.Override
protected java.lang.Boolean compute() {
    java.math.BigInteger tmp = to.subtract(from);
    if ((tmp.compareTo(forkjoin.prime.PureForkJoin.lengthForThread)) <= 0) {
        return computeDirectly();
    }
    java.math.BigInteger middle = to.divide(Utils.two);
    forkjoin.prime.PureForkJoin leftJoin = new forkjoin.prime.PureForkJoin(primeNumber, from, middle);
    forkjoin.prime.PureForkJoin rightJoin = new forkjoin.prime.PureForkJoin(primeNumber, middle.add(java.math.BigInteger.ONE), to);
    return (leftJoin.compute()) && (rightJoin.compute());
}