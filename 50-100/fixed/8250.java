@org.jplus.hyb.database.crud.Test
public void testShowList() {
    java.lang.System.out.println("showList");
    java.lang.String sql = "select * from Servers";
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin(new org.jplus.model.Servers());
    java.util.List result = null;
    try {
        result = instance.showList(sql);
    } catch (java.sql.SQLException ex) {
        fail("testShowList faild.");
        ex.printStackTrace();
    }
    assertFalse(org.jplus.util.ObjectHelper.isEmpty(result));
    assertTrue(((result.size()) == 5));
}