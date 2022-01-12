protected void writeSnappyPocToSparkEnv() {
    java.lang.String filePath = ((productConfDirPath) + (sep)) + "spark-env.sh";
    java.io.File file = new java.io.File(filePath);
    file.setExecutable(true);
    java.lang.String fileContent = "SPARK_DIST_CLASSPATH=" + (io.snappydata.hydra.adAnalytics.SnappyAdAnalyticsTest.snappyPocJarPath);
    io.snappydata.hydra.adAnalytics.SnappyAdAnalyticsTest.snappyAdAnalyticsTest.writeToFile(fileContent, file);
}