@org.springframework.core.annotation.Order(value = 5)
public void testLoadNCItHistory() throws java.lang.InterruptedException, org.LexGrid.LexBIG.Exceptions.LBException {
    org.LexGrid.LexBIG.LexBIGService.LexBIGServiceManager lbsm = getLexBIGServiceManager();
    org.LexGrid.LexBIG.Extensions.Load.NCIHistoryLoader hloader = ((org.LexGrid.LexBIG.Extensions.Load.NCIHistoryLoader) (lbsm.getLoader("NCIThesaurusHistoryLoader")));
    hloader.load(new java.io.File("resources/testData/Filtered_pipe_out_12f.txt").toURI(), new java.io.File("resources/testData/SystemReleaseHistory.txt").toURI(), false, true, false);
    assertEquals(ProcessState.COMPLETED, hloader.getStatus().getState());
    assertFalse(hloader.getStatus().getErrorsLogged().booleanValue());
}