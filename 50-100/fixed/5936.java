@org.junit.Test
public void testToFAGetToFAnswerByNullId() {
    try {
        java.lang.Long optionSeq = null;
        br.cefetmg.jquest.model.service.TrueOrFalseAnswerManagementImplTest.tofaManagement.getToFAnswerById(optionSeq);
    } catch (br.cefetmg.jquest.model.exception.BusinessException | br.cefetmg.jquest.model.exception.PersistenceException ex) {
        java.lang.String msgErr = ex.getMessage();
        java.lang.String msgEsperada = "No Answer ID was informed";
        org.junit.Assert.assertTrue("GetById of null TrueOrFalseAnswer ID", msgErr.contains(msgEsperada));
        return ;
    }
    org.junit.Assert.fail("GetById of null TrueOrFalseAnswer ID didnt throw an exception");
}