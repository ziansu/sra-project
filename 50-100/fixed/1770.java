@org.junit.Test
public void testTacTicToc() {
    log.enableLog();
    io.wabm.TacFactory tac = null;
    io.wabm.TicFacotry tic = null;
    io.wabm.TocFactory toc = null;
    tac.sayTac();
    tic.sayTic();
    toc.sayToc();
    assertEquals("tactictoc", log.getLog());
}