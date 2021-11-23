@javax.transaction.Transactional
@org.junit.Test
public void testRoleExists() {
    java.lang.System.out.println("6");
    boolean postoi;
    postoi = roleDAO.roleExists(1);
    org.junit.Assert.assertEquals(true, postoi);
}