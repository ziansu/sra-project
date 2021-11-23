@org.junit.BeforeClass
public static void setup() throws java.lang.Exception {
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.sconf = new org.apache.spark.SparkConf().setMaster("local").setAppName("Spark-Hbase Connector");
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.sconf.set("spark.driver.host", "127.0.0.1");
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.sc = new org.apache.spark.api.java.JavaSparkContext(edu.mayo.hadoop.commons.examples.SparkHBaseITCase.sconf);
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.configuration = edu.mayo.hadoop.commons.hbase.AutoConfigure.getConfiguration();
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.hbaseContext = new org.apache.hadoop.hbase.spark.JavaHBaseContext(edu.mayo.hadoop.commons.examples.SparkHBaseITCase.sc, edu.mayo.hadoop.commons.examples.SparkHBaseITCase.configuration);
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.hconnect = org.apache.hadoop.hbase.client.ConnectionFactory.createConnection(edu.mayo.hadoop.commons.examples.SparkHBaseITCase.configuration);
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.hutil = new edu.mayo.hadoop.commons.hbase.HBaseUtil(edu.mayo.hadoop.commons.examples.SparkHBaseITCase.hconnect);
    edu.mayo.hadoop.commons.examples.SparkHBaseITCase.hutil.createTable(edu.mayo.hadoop.commons.examples.SparkHBaseITCase.tableName, new java.lang.String[]{ "cf1" });
}