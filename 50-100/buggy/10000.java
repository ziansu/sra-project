@org.junit.Test
public void configuresMultipleCuriesWithoutDefaultCorrectly() {
    org.springframework.hateoas.hal.DefaultCurieProvider provider = new org.springframework.hateoas.hal.DefaultCurieProvider(org.springframework.hateoas.hal.DefaultCurieProviderUnitTest.getCuries());
    org.junit.Assert.assertThat(provider.getCurieInformation(new org.springframework.hateoas.Links()), hasSize(2));
    org.junit.Assert.assertThat(provider.getNamespacedRelFor("some"), org.hamcrest.CoreMatchers.is("some"));
}