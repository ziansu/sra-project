@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public void write(io.github.xeyez.domain.BoardVO vo) throws java.lang.Exception {
    dao.create(vo);
    java.lang.String[] files = vo.getFiles();
    if (files != null) {
        for (java.lang.String fullName : files) {
            dao.addAttach(fullName);
        }
    }
    dao.updateFilescnt(vo.getBno());
}