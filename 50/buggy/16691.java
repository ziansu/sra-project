@org.junit.Test
public void testIntegerFeature() throws java.lang.Exception {
    java.util.List<java.lang.Integer> x = java.util.Arrays.asList(111, 222);
    org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector featureOI = org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory.javaIntObjectInspector;
    testFeature(x, featureOI, java.lang.Integer.class);
}