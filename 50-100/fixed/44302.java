@org.junit.Test
public void testTOFANullInsertion() throws br.cefetmg.jquest.model.exception.BusinessException, br.cefetmg.jquest.model.exception.PersistenceException {
    try {
        this.tofa = null;
        br.cefetmg.jquest.model.service.TrueOrFalseAnswerManagementImplTest.tofaManagement.insert(tofa);
    } catch (br.cefetmg.jquest.model.exception.BusinessException | br.cefetmg.jquest.model.exception.PersistenceException ex) {
        java.util.ArrayList<java.lang.String> msgErr = new java.util.ArrayList(java.util.Arrays.asList(ex.getMessage().split("\n")));
        java.lang.String msgEsperada = "No TrueOrFalseAnswer was informed";
        org.junit.Assert.assertTrue(msgErr.contains(msgEsperada));
    } catch (java.lang.NullPointerException ex) {
        org.junit.Assert.fail("Insertion of null TrueOrFalseAnswer");
    }
}