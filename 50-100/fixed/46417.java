@org.testng.annotations.Test(expectedExceptions = { org.apache.hadoop.hive.ql.parse.SemanticException.class })
public void testGetEvaluatorDeprecated() throws java.io.IOException, org.apache.hadoop.hive.ql.parse.SemanticException {
    com.yahoo.sketches.hive.theta.DataToSketchUDAF udf = new com.yahoo.sketches.hive.theta.DataToSketchUDAF();
    try (org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator eval = udf.getEvaluator(new org.apache.hadoop.hive.serde2.typeinfo.TypeInfo[]{ com.yahoo.sketches.hive.theta.DataToSketchUDAFTest.binaryType , com.yahoo.sketches.hive.theta.DataToSketchUDAFTest.intType , com.yahoo.sketches.hive.theta.DataToSketchUDAFTest.doubleType })) {
        org.testng.Assert.assertNotNull(eval);
        org.hamcrest.MatcherAssert.assertThat(eval, org.hamcrest.core.IsInstanceOf.instanceOf(com.yahoo.sketches.hive.theta.DataToSketchUDAF.DataToSketchEvaluator.class));
    }
}