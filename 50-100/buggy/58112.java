@org.junit.Test
public void getTotalPages_returnsTotalNumberOfPages() {
    uk.gov.register.presentation.resource.Pagination pagination = new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(1L), java.util.Optional.of(10L), 10);
    assertThat(pagination.getTotalPages(), org.hamcrest.Matchers.equalTo(1L));
    pagination = new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(1L), java.util.Optional.of(10L), 11);
    assertThat(pagination.getTotalPages(), org.hamcrest.Matchers.equalTo(2L));
}