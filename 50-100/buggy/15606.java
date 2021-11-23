@org.junit.Test
public void shouldCreateSizeList() {
    final org.apache.spark.sql.SQLContext ssc = ssc();
    final org.apache.spark.sql.DataFrame dataFrame = new com.gayakwad.TestUtils().salesDataFrame(ssc);
    final org.apache.spark.sql.DataFrame sizeDF = new com.gayakwad.AvailableSizes().calculate(ssc, dataFrame);
    org.junit.Assert.assertEquals(sizeDF.count(), 3);
}