@org.jplus.hyb.database.crud.Test
public void testShowAll() {
    java.lang.System.out.println("showAll");
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin(new org.jplus.model.Servers());
    try {
        java.util.List result = instance.showAll();
        assertTrue(org.jplus.util.ObjectHelper.isNotEmpty(result));
    } catch (java.sql.SQLException ex) {
        fail("testShowAll faild.");
        ex.printStackTrace();
    }
}