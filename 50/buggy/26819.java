@org.junit.Test
public void testRead() {
    es.jab.persistence.model.entities.Tema t = temaDao.read(tema.getId());
    org.junit.Assert.assertEquals(tema, temaDao.read(tema.getId()));
}