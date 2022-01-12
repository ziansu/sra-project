@org.junit.Test
public void testGet() {
    org.junit.Assert.assertThat(parameters.get("test"), org.hamcrest.CoreMatchers.is(param));
}