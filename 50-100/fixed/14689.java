@org.junit.Test
public void offset_returnsTheNumberWhichOffsetsTheTotalEntriesBasedOnPageSize() {
    assertThat(new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(1L), java.util.Optional.of(10L), 100).offset(), org.hamcrest.Matchers.equalTo(0L));
    assertThat(new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(2L), java.util.Optional.of(10L), 100).offset(), org.hamcrest.Matchers.equalTo(10L));
}