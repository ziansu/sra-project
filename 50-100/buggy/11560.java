public static void main(final java.lang.String[] args) throws java.lang.InterruptedException {
    final long runtime = ((args.length) > 1) ? java.lang.Long.parseLong(args[1]) : com.awesome.BaseExamplePeriod.DEFAULT_RUN_TIME_MSEC;
    com.awesome.ex1_2.Ex1_2 ex = new com.awesome.ex1_2.Ex1_2(runtime);
    ex.run();
    ex.printResults();
}