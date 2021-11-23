@org.junit.Test
public void shouldElementsAccessedWhenToString() {
    java.lang.Object stub = mock(java.lang.Object.class);
    when(stub.toString()).thenReturn("test data");
    testList.add(stub);
    java.lang.String result = testList.toString();
    verify(stub).toString();
    org.junit.Assert.assertTrue(result.contains("test data"));
    java.lang.System.out.println(result);
    org.fest.assertions.Assertions.assertThat(result).contains("test data").doesNotContain("!!!!!");
}