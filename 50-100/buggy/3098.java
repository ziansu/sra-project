@org.junit.Test
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
        org.junit.Assert.fail("testAddParmeter faild.");
    }
    java.lang.System.out.println(mapList);
    org.junit.Assert.assertNotNull(mapList);
    org.junit.Assert.assertTrue(org.jplus.util.ObjectHelper.isNotEmpty(mapList));
}