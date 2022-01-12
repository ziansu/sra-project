@org.junit.Test
public void kebabCase_shouldConvertAStringToKebabCase() throws java.lang.Exception {
    java.lang.String[] input = new java.lang.String[]{ "Foo Bar" , "fooBar" };
    java.util.Arrays.stream(input).forEach(( el) -> assertThat(java.lang.String.format("%s should be foo-bar", el), toKebabCase(el), is(equalTo("foo-bar"))));
}