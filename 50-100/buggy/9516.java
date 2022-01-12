public static synchronized org.apache.sqoop.submission.spark.YarnSqoopSparkClient getInstance(java.util.Map<java.lang.String, java.lang.String> conf) {
    if ((org.apache.sqoop.submission.spark.YarnSqoopSparkClient.client) == null) {
        java.lang.System.setProperty(org.apache.sqoop.submission.spark.YarnSqoopSparkClient.YARN_MODE, "true");
        org.apache.spark.SparkConf sparkConf = org.apache.sqoop.submission.spark.SqoopSparkClientFactory.generateSparkConf(conf);
        org.apache.sqoop.submission.spark.YarnSqoopSparkClient.client = new org.apache.sqoop.submission.spark.YarnSqoopSparkClient(sparkConf);
        org.apache.sqoop.submission.spark.YarnSqoopSparkClient.yarnConfig = org.apache.sqoop.submission.spark.YarnSqoopSparkClient.generateYarnSparkConf(conf);
        org.apache.sqoop.submission.spark.YarnSqoopSparkClient.clientArgs = new org.apache.spark.deploy.yarn.ClientArguments(org.apache.sqoop.submission.spark.YarnSqoopSparkClient.args, sparkConf);
    }
    return org.apache.sqoop.submission.spark.YarnSqoopSparkClient.client;
}