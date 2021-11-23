public void testCreate() throws java.lang.Exception {
    logger.info("============== 삽입");
    io.github.xeyez.domain.BoardVO vo = new io.github.xeyez.domain.BoardVO("userTitle", "userContent", "user");
    dao.create(vo);
}