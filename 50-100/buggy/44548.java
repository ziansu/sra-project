@org.junit.Test
public void testVectorRegression() {
    org.nd4j.linalg.dataset.DataSet dataSet = new org.nd4j.linalg.dataset.DataSet(org.nd4j.linalg.factory.Nd4j.create(2, 2), org.nd4j.linalg.factory.Nd4j.create(new double[][]{ new double[]{ 1 , 1 } , new double[]{ 1 , 1 } }));
    org.datavec.spark.transform.model.SingleCSVRecord singleCsvRecord = org.datavec.spark.transform.model.SingleCSVRecord.fromRow(dataSet.get(0));
    org.junit.Assert.assertEquals(4, singleCsvRecord.getValues().length);
}