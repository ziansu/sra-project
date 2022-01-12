@org.junit.Test
public void testScanDirectory() {
    try {
        java.util.List<java.lang.Class<?>> classes = new java.util.ArrayList<>();
        com.orctom.laputa.utils.ClassUtils.getClassesWithAnnotation("com.orctom.laputa.utils", RunListener.ThreadSafe.class, classes::add);
        org.junit.Assert.assertThat(classes.size(), org.hamcrest.Matchers.greaterThan(0));
    } catch (com.orctom.laputa.exception.ClassLoadingException e) {
        e.printStackTrace();
    }
}