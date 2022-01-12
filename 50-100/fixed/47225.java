@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public void modify(io.github.xeyez.domain.BoardVO vo) throws java.lang.Exception {
    dao.update(vo);
    long bno = vo.getBno();
    dao.deleteAllAttach(bno);
    java.lang.String[] files = vo.getFiles();
    if (files != null) {
        for (java.lang.String fullName : files) {
            dao.replaceAttach(fullName, bno);
        }
    }
    dao.updateFilescnt();
}