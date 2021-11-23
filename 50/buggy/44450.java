@org.junit.Test
@org.robolectric.annotation.Config(qualifiers = "fr")
public void shouldGetFromMethod() throws java.lang.Exception {
    java.lang.String expectedQualifiers = "fr" + (TestRunners.WithDefaults.SDK_TARGETED_BY_MANIFEST);
    org.assertj.core.api.Assertions.assertThat(org.robolectric.RuntimeEnvironment.getQualifiers()).isEqualTo(expectedQualifiers);
}