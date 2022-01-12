@org.testng.annotations.Test
public void testGetEvaluator() throws org.apache.hadoop.hive.ql.parse.SemanticException {
    com.yahoo.sketches.hive.theta.DataToSketchUDAF udf = new com.yahoo.sketches.hive.theta.DataToSketchUDAF();
    org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo params = new org.apache.hadoop.hive.ql.udf.generic.SimpleGenericUDAFParameterInfo(new org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector[]{ com.yahoo.sketches.hive.theta.DataToSketchUDAFTest.inputOI }, false, false);
    org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator eval = udf.getEvaluator(params);
    org.testng.Assert.assertNotNull(eval);
    org.hamcrest.MatcherAssert.assertThat(eval, org.hamcrest.core.IsInstanceOf.instanceOf(com.yahoo.sketches.hive.theta.DataToSketchUDAF.DataToSketchEvaluator.class));
}