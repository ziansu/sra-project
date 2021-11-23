@org.junit.Test
public void testApprove() {
    setupPostWithRestResultExpectations("/project/123/partner-organisation/456/finance-check/approve", org.springframework.http.HttpStatus.OK);
    service.approveFinanceCheck(123L, 456L);
    setupPostWithRestResultVerifications("/project/123/partner-organisation/456/finance-check/approve", java.lang.Void.class);
}