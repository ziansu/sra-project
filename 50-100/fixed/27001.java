public static void main(java.lang.String[] args) {
    long seed = java.lang.System.currentTimeMillis();
    java.util.Random random = new java.util.Random(seed);
    java.lang.System.out.println(("Seed = " + seed));
    net.coderodde.util.Demo.warmup(random);
    net.coderodde.util.Demo.benchmark(random);
}