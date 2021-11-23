@org.junit.Test
public void testLongFeature() throws java.lang.Exception {
    java.util.List<java.lang.Long> x = java.util.Arrays.asList(111L, 222L);
    org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector featureOI = org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory.javaLongObjectInspector;
    testFeature(x, featureOI, java.lang.Long.class);
}