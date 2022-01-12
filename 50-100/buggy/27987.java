@org.junit.Test
public void isSinglePage_retrunsTrue_whenPageContainsAllEntries() {
    uk.gov.register.presentation.resource.Pagination pagination = new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(1L), java.util.Optional.of(100L), 99);
    assertThat(pagination.isSinglePage(), org.hamcrest.Matchers.equalTo(true));
    pagination = new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(1L), java.util.Optional.of(100L), 100);
    assertThat(pagination.isSinglePage(), org.hamcrest.Matchers.equalTo(true));
}