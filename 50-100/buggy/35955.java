@org.junit.Test
public void testTOFANullUpdate() throws br.cefetmg.jquest.model.exception.BusinessException, br.cefetmg.jquest.model.exception.PersistenceException {
    try {
        this.tofa = null;
        br.cefetmg.jquest.model.service.TrueOrFalseAnswerManagementImplTest.tofaManagement.update(tofa);
    } catch (br.cefetmg.jquest.model.exception.BusinessException | br.cefetmg.jquest.model.exception.PersistenceException ex) {
        java.lang.String msgErr = ex.getMessage();
        java.lang.String msgEsperada = "No TrueOrFalseAnswer was informed";
        org.junit.Assert.assertTrue(msgErr.contains(msgEsperada));
        return ;
    }
    org.junit.Assert.fail("Update of null TrueOrFalseAnswer didnt throw an exception");
}