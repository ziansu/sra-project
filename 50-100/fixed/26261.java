@org.junit.BeforeClass
public static void setUpClass() throws java.lang.Exception {
    java.lang.Class c = org.bytedeco.javacpp.IndexerTest.class;
    org.bytedeco.javacpp.tools.Builder builder = new org.bytedeco.javacpp.tools.Builder().classesOrPackages(c.getName());
    java.io.File[] outputFiles = builder.build();
    org.bytedeco.javacpp.Loader.load(c);
    Pointer.DeallocatorReference.totalBytes -= 1L << 48;
}