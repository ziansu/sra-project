@org.jplus.hyb.database.crud.Test
public void testGetMapList_String() {
    java.lang.System.out.println("getMapList");
    java.lang.String sql = "select * from Servers";
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin();
    java.util.List<java.util.Map> result = null;
    try {
        result = instance.getMapList(sql);
    } catch (java.sql.SQLException ex) {
        fail("testGetMapList_String faild.");
        ex.printStackTrace();
    }
    assertFalse(org.jplus.util.ObjectHelper.isEmpty(result));
    assertTrue(((result.size()) == 5));
}