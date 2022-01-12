@org.jplus.hyb.database.crud.Test
public void testAddParmeter() {
    java.lang.System.out.println("addParmeter");
    java.lang.Object parmeter = 1;
    java.lang.String sql = "select * from servers where id=?";
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin();
    instance.addParmeter(parmeter);
    java.util.List<java.util.Map> mapList = null;
    try {
        mapList = instance.getMapList(sql);
    } catch (java.sql.SQLException ex) {
        fail("testAddParmeter faild.");
    }
    java.lang.System.out.println(mapList);
    assertNotNull(mapList);
    assertTrue(org.jplus.util.ObjectHelper.isNotEmpty(mapList));
}