@org.junit.Test
public void getLastEntryNumberOnThisPage_returnsTheNumberOfLastEntryOnPage() {
    uk.gov.register.presentation.resource.Pagination pagination = new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(2L), java.util.Optional.of(10L), 12);
    assertThat(pagination.getLastEntryNumberOnThisPage(), org.hamcrest.Matchers.equalTo(12L));
}