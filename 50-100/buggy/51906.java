@org.junit.Test
public void testScanDirectory() {
    try {
        java.util.List<java.lang.Class<?>> classes = com.orctom.laputa.utils.ClassUtils.getClassesWithAnnotation("com.orctom.laputa.utils", RunListener.ThreadSafe.class);
        classes.forEach(( clazz) -> com.orctom.laputa.utils.ClassUtilsTest.LOGGER.debug(clazz.getName()));
        org.junit.Assert.assertThat(classes, org.hamcrest.Matchers.notNullValue());
        org.junit.Assert.assertThat(classes.size(), org.hamcrest.Matchers.greaterThan(0));
    } catch (com.orctom.laputa.exception.ClassLoadingException e) {
        e.printStackTrace();
    }
}