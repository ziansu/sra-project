@org.junit.Test
public void itAvoidsNestedIncludeCycles() throws java.io.IOException {
    java.lang.String result = jinjava.render(com.google.common.io.Resources.toString(com.google.common.io.Resources.getResource("tags/includetag/a-includes-b.jinja"), java.nio.charset.StandardCharsets.UTF_8), new java.util.HashMap<java.lang.String, java.lang.Object>());
    org.assertj.core.api.Assertions.assertThat(result).containsSequence("A", "B");
}