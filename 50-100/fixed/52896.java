public static void main(java.lang.String[] args) {
    if ((args.length) < 4) {
        java.lang.System.out.println((("Usage: " + (com.dsinpractice.spark.samples.SetOperations.class.getName())) + " <inpath1> <inpath2> <outpath> <operation = union | intersection>"));
        java.lang.System.exit((-1));
    }
    com.dsinpractice.spark.samples.SetOperations setOperations = new com.dsinpractice.spark.samples.SetOperations();
    setOperations.run(args);
}