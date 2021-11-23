public void testsUnsupportedTagsJoin() {
    try {
        compile("{{#join}}{{/join}}");
    } catch (com.github.mustachejava.MustacheException e) {
        assertThat(e.getMessage(), org.hamcrest.Matchers.containsString("Mustache function [join] must contain one and only one identifier"));
    }
    try {
        compile("{{#join delimiter='a'}}{{/join delimiter='b'}}");
    } catch (com.github.mustachejava.MustacheException e) {
        assertThat(e.getMessage(), org.hamcrest.Matchers.containsString("Mismatched start/end tags"));
    }
}