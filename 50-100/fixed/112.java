public void testsUnsupportedTagsToJson() {
    try {
        compile("{{#toJson}}{{foo}}{{bar}}{{/toJson}}");
        fail("Expected MustacheException");
    } catch (com.github.mustachejava.MustacheException e) {
        assertThat(e.getMessage(), containsString("Mustache function [toJson] must contain one and only one identifier"));
    }
    try {
        compile("{{#toJson}}{{/toJson}}");
        fail("Expected MustacheException");
    } catch (com.github.mustachejava.MustacheException e) {
        assertThat(e.getMessage(), containsString("Mustache function [toJson] must contain one and only one identifier"));
    }
}