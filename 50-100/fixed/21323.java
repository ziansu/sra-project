@org.junit.Test
public void test_report_global_modification() {
    dryRunCache.reportGlobalModification();
    org.mockito.ArgumentCaptor<org.sonar.core.properties.PropertyDto> argument = org.mockito.ArgumentCaptor.forClass(org.sonar.core.properties.PropertyDto.class);
    verify(propertiesDao).setProperty(argument.capture(), org.mockito.Matchers.eq(session));
    org.assertj.core.api.Assertions.assertThat(argument.getValue().getKey()).isEqualTo(PreviewCache.SONAR_PREVIEW_CACHE_LAST_UPDATE_KEY);
    org.assertj.core.api.Assertions.assertThat(argument.getValue().getValue()).isNotNull();
    verify(session).commit();
}