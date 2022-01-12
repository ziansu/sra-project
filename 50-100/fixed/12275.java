@org.junit.Test
public void testTOFANullOptionSeqRemoval() throws br.cefetmg.jquest.model.exception.BusinessException, br.cefetmg.jquest.model.exception.PersistenceException {
    try {
        this.tofa.setOptionSeq(null);
        br.cefetmg.jquest.model.service.TrueOrFalseAnswerManagementImplTest.tofaManagement.remove(tofa.getOptionSeq());
    } catch (br.cefetmg.jquest.model.exception.BusinessException | br.cefetmg.jquest.model.exception.PersistenceException ex) {
        java.util.ArrayList<java.lang.String> msgErr = new java.util.ArrayList(java.util.Arrays.asList(ex.getMessage().split("\n")));
        java.lang.String msgEsperada = "No Answer ID was informed";
        org.junit.Assert.assertTrue(msgErr.contains(msgEsperada));
        return ;
    }
    org.junit.Assert.fail("Update of null TrueOrFalseAnswer ID");
}