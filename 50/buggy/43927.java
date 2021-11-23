@org.junit.Test
public void testAdd() {
    parametersEmpty.add(param);
    org.junit.Assert.assertThat(parametersEmpty.get("test"), org.hamcrest.CoreMatchers.is(param));
}