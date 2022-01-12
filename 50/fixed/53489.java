public void start() {
    spark = startSparkCopyOnNewPort();
    createControllers.accept(spark, config);
    spark.awaitInitialization();
}