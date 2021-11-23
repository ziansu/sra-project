static synchronized void stop() {
    if ((spark.Spark.server) != null) {
        spark.Spark.server.stop();
        spark.Spark.initialized = false;
    }
}