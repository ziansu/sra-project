@org.jplus.hyb.database.crud.Test
public void testGetCount() {
    java.lang.System.out.println("getCount");
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin();
    int result = 0;
    try {
        result = instance.getCount("select * from servers");
    } catch (java.sql.SQLException ex) {
        fail("testGetCount faild.");
        ex.printStackTrace();
    }
    assertTrue((result > 0));
}