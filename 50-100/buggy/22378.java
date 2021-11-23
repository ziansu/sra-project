@org.junit.Test
public void simpleStub() {
    com.gale.domain.Foo foo = new com.gale.domain.Foo();
    foo.setBar(bar);
    org.mockito.Mockito.when(bar.getName()).thenReturn("foobr");
    java.lang.String result = bar.getName();
    org.junit.Assert.assertThat(result, org.hamcrest.Matchers.containsString("foo"));
}