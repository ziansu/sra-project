@org.junit.Test
public void noFilePattern() throws java.io.IOException {
    configure(null, null);
    org.junit.Assert.assertThat(scannerPlugin.accepts(fileResource, "test.txt", DefaultScope.NONE), org.hamcrest.CoreMatchers.equalTo(true));
    org.junit.Assert.assertThat(scannerPlugin.accepts(fileResource, "test.xml", DefaultScope.NONE), org.hamcrest.CoreMatchers.equalTo(true));
}