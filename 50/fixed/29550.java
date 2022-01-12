@org.junit.Test
public void testStringFeature() throws java.lang.Exception {
    java.util.List<java.lang.String> x = java.util.Arrays.asList("1:-2", "2:-1");
    org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector featureOI = org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    testFeature(x, featureOI, java.lang.String.class, java.lang.String.class);
}