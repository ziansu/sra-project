public T update(T memoData) {
    init();
    session = pb.rest.jaxrs.db.MemoDAO.sqlMapper.openSession(true);
    session.update(((pb.rest.jaxrs.db.MemoDAO.objectName) + "Mapper.update"), memoData);
    session.close();
    return memoData;
}