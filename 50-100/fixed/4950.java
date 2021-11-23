@org.junit.Test
public void postDuplicateApplicantsValidationTest() throws java.io.IOException {
    try {
        gov.ca.cwds.cals.service.dto.rfa.RFA1aFormDTO form = gov.ca.cwds.cals.web.rest.rfa.RFAHelper.createForm(clientTestRule);
        postApplicant(form, getApplicantDTO());
        postApplicant(form, getApplicantDTO());
        org.junit.Assert.fail();
    } catch (javax.ws.rs.ClientErrorException e) {
        org.junit.Assert.assertEquals(422, e.getResponse().getStatus());
    }
}