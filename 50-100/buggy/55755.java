@org.junit.Test
public void getUserList() throws org.hibernate.HibernateException {
    java.util.List list = dao.getUserList();
    int i;
    for (i = 0; i < (list.size()); i++) {
        i++;
    }
    assertNotNull("list is not null", list.size());
    assertTrue(((list.size()) == i));
}