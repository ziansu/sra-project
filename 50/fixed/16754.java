public void remove(int _id) {
    init();
    session = pb.rest.jaxrs.db.MemoDAO.sqlMapper.openSession(true);
    session.delete(((pb.rest.jaxrs.db.MemoDAO.objectName) + "Mapper.remove"), _id);
    session.close();
}