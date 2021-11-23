@org.junit.Test(expected = javax.ws.rs.BadRequestException.class)
public void construct_throwsExceptionForPageSizeGreaterThan5000() {
    new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(1L), java.util.Optional.of(5001L), 10);
}