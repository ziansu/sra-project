@dao.Test
public void deleteTest() {
    entity.StaticData insertStaticData = dao.StaticDataDAOTest.stDAO.create(dao.StaticDataDAOTest.stData);
    long id = dao.StaticDataDAOTest.stDAO.delete(insertStaticData);
    dao.Assert.assertEquals(id, insertStaticData.getId());
    entity.StaticData nullStaticData = dao.StaticDataDAOTest.stDAO.getById(insertStaticData.getId());
    dao.Assert.assertNull(nullStaticData);
}