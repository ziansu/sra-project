@dao.Test
public void deleteTest() {
    entity.StaticData insertStaticData = dao.StaticDataDAOTest.stDAO.create(dao.StaticDataDAOTest.stData);
    long id = dao.StaticDataDAOTest.stDAO.delete(dao.StaticDataDAOTest.stData);
    dao.Assert.assertEquals(id, insertStaticData.getId());
    entity.StaticData nullStaticData = dao.StaticDataDAOTest.stDAO.getById(dao.StaticDataDAOTest.stData.getId());
    dao.Assert.assertNull(nullStaticData);
}