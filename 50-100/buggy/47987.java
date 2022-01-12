@org.junit.Test
public void isValidNoId() {
    org.cloudfoundry.client.ValidationResult result = org.cloudfoundry.client.v2.spaces.ListSpaceAuditorsRequest.builder().auditorId("test-auditor-id").build().isValid();
    org.junit.Assert.assertEquals(org.cloudfoundry.client.ValidationResult.Status.INVALID, result.getStatus());
    org.junit.Assert.assertEquals("id must be specified", result.getMessages().get(0));
}