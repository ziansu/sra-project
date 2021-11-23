@org.junit.Test
public void functions() {
    java.util.List<java.lang.String> result = $.functions(new com.github.underscore.$(""));
    org.junit.Assert.assertEquals("[after, all, any, before, bind]", $.first(result, 5).toString());
}