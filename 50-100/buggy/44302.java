@org.junit.Test
public void testTOFANullInsertion() throws br.cefetmg.jquest.model.exception.BusinessException, br.cefetmg.jquest.model.exception.PersistenceException {
    try {
        this.tofa = null;
        br.cefetmg.jquest.model.service.TrueOrFalseAnswerManagementImplTest.tofaManagement.insert(tofa);
    } catch (br.cefetmg.jquest.model.exception.BusinessException | br.cefetmg.jquest.model.exception.PersistenceException ex) {
        java.lang.String msgErr = ex.getMessage();
        java.lang.String msgEsperada = "No TrueOrFalseAnswer was informed";
        org.junit.Assert.assertTrue(msgErr.contains(msgEsperada));
    } catch (java.lang.NullPointerException ex) {
        org.junit.Assert.fail("Insertion of null TrueOrFalseAnswer");
    }
}