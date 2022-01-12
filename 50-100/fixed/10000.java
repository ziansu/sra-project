@org.junit.Test
public void configuresMultipleCuriesWithoutDefaultCorrectly() {
    org.springframework.hateoas.hal.DefaultCurieProvider provider = new org.springframework.hateoas.hal.DefaultCurieProvider(org.springframework.hateoas.hal.DefaultCurieProviderUnitTest.getCuries());
    assertThat(provider.getCurieInformation(new org.springframework.hateoas.Links()), hasSize(2));
    assertThat(provider.getNamespacedRelFor("some"), is("some"));
}