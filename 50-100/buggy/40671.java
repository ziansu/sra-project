@org.junit.Test
public void testToFAInsertNullQuestionId() throws br.cefetmg.jquest.model.exception.PersistenceException {
    try {
        this.tofa.setQuestionId(null);
        br.cefetmg.jquest.model.service.TrueOrFalseAnswerManagementImplTest.tofaManagement.insert(tofa);
    } catch (br.cefetmg.jquest.model.exception.BusinessException ex) {
        java.util.ArrayList<java.lang.String> msgErr = new java.util.ArrayList(java.util.Arrays.asList(ex.getMessage().split("\n")));
        java.lang.String msgEsperada = "No question ID was associated to the answer";
        org.junit.Assert.assertTrue("Insertion of TOFA with null question ID", msgErr.contains(msgEsperada));
    }
    org.junit.Assert.fail("Insertion of TOFA with null question ID didnt throw an exception");
}