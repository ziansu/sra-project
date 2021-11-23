@org.junit.Test
@org.robolectric.annotation.Config(qualifiers = "fr")
public void shouldGetFromMethod() throws java.lang.Exception {
    org.assertj.core.api.Assertions.assertThat(org.robolectric.RuntimeEnvironment.getQualifiers()).contains("fr");
}