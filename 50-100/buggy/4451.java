@org.junit.Test
public void testGetRow() {
    java.lang.System.out.println("Testing :: UserManager.getRow()");
    boolean isInserted = companyInstance.insert(layer3.dataSource.mapper.UserManagerTest.conn, company);
    if (!isInserted)
        java.lang.System.err.println("        :: Something whent wrong when creating a company");
    
    insertRow();
    java.lang.System.out.println(user.toString());
    layer2.domain.bean.User expResult = user;
    layer2.domain.bean.User result = userInstance.getRow(layer3.dataSource.mapper.UserManagerTest.conn, user.getUserID());
    result.toString();
    assertTrue("        :: Retrieved data is not as expected", expResult.toString().equals(result.toString()));
}