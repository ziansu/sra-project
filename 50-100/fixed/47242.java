@org.junit.Test
public void configuresMultipleCuriesWithDefaultCorrectly() {
    org.springframework.hateoas.hal.DefaultCurieProvider provider = new org.springframework.hateoas.hal.DefaultCurieProvider(org.springframework.hateoas.hal.DefaultCurieProviderUnitTest.getCuries(), "foo", null);
    assertThat(provider.getCurieInformation(new org.springframework.hateoas.Links()), hasSize(2));
    assertThat(provider.getNamespacedRelFor("some"), is("foo:some"));
}