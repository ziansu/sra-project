@org.junit.Test
public void functions() {
    java.util.List<java.lang.String> result = $.functions(new com.github.underscore.$(""));
    org.junit.Assert.assertEquals(5, $.first(result, 5).size());
}