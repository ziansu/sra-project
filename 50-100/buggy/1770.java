@org.junit.Test
public void testTacTicToc() {
    log.enableLog();
    io.wabm.TacFactory tac;
    io.wabm.TicFacotry tic;
    io.wabm.TocFactory toc;
    tac.sayTac();
    tic.sayTic();
    toc.sayToc();
    assertEquals("tactictoc", log.getLog());
}