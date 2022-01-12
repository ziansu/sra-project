@java.lang.Override
public void execute() {
    try {
        checkParameters();
        if (benchmark) {
            runBenchmark();
        }else {
            runAnnotation();
        }
        logger.info("Finished");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}