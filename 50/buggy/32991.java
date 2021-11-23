@org.junit.Test
public void testCollect() {
    cn.edu.nju.application.data.UserDaoImpl dao = new cn.edu.nju.application.data.UserDaoImpl();
    java.lang.System.out.println(dao.showCollections("tj").get(0).getPost_Id());
}