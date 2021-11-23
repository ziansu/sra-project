@org.junit.Test
public void hasPreviousPage_returnsTrueOnlyWhenPageIndexIsMoreThanOne() {
    assertFalse(new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(1L), java.util.Optional.of(10L), 10).hasPreviousPage());
    assertFalse(new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(1L), java.util.Optional.of(10L), 11).hasPreviousPage());
    assertTrue(new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(2L), java.util.Optional.of(10L), 11).hasPreviousPage());
}