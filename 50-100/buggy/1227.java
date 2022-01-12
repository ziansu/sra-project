@org.junit.Test
public void testClassLoaderFilter() throws java.lang.Exception {
    org.hamcrest.MatcherAssert.assertThat(new net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder().append(getClass().getClassLoader(), null).filter(net.bytebuddy.matcher.ElementMatchers.isBootstrapClassLoader()).build(), org.hamcrest.CoreMatchers.is(getClass().getClassLoader()));
}