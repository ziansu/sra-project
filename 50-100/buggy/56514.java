@org.junit.BeforeClass
public static void setUpClass() throws java.lang.Exception {
    java.lang.Class c = org.bytedeco.javacpp.PointerTest.class;
    org.bytedeco.javacpp.tools.Builder builder = new org.bytedeco.javacpp.tools.Builder().classesOrPackages(c.getName());
    java.io.File[] outputFiles = builder.build();
    Loader.loadLibraries = true;
    org.bytedeco.javacpp.Loader.load(c);
}