@org.junit.Test
public void testShowList() {
    java.lang.System.out.println("showList");
    java.lang.String sql = "select * from Servers";
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin(new org.jplus.model.Servers());
    java.util.List result = null;
    try {
        result = instance.showList(sql);
    } catch (java.sql.SQLException ex) {
        org.junit.Assert.fail("testShowList faild.");
        ex.printStackTrace();
    }
    org.junit.Assert.assertFalse(org.jplus.util.ObjectHelper.isEmpty(result));
    org.junit.Assert.assertTrue(((result.size()) == 5));
}