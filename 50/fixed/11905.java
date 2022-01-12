@org.junit.Test
public void isSinglePage_retrunsFalse_whenPageDoesNotContainsAllEntries() {
    uk.gov.register.presentation.resource.Pagination pagination = new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(2L), java.util.Optional.of(50L), 99);
    assertThat(pagination.isSinglePage(), org.hamcrest.Matchers.equalTo(false));
}