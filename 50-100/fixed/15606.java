@org.junit.Test
public void shouldCreateSizeList() {
    final org.apache.spark.sql.SQLContext ssc = ssc();
    final org.apache.spark.sql.DataFrame dataFrame = new com.gayakwad.TestUtils().salesDataFrame(ssc);
    dataFrame.show();
    final org.apache.spark.sql.DataFrame sizeDF = new com.gayakwad.AvailableSizes().calculate(ssc, dataFrame);
    sizeDF.show();
    org.junit.Assert.assertEquals(sizeDF.count(), 3);
}