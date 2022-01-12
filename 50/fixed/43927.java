@org.junit.Test
public void testAdd() {
    parametersEmpty.add(param);
    org.junit.Assert.assertThat(parametersEmpty.get(key), org.hamcrest.CoreMatchers.is(param));
}