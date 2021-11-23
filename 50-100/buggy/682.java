@org.junit.Test
public void testShowAll() {
    java.lang.System.out.println("showAll");
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin(new org.jplus.model.Servers());
    try {
        java.util.List result = instance.showAll();
        org.junit.Assert.assertTrue(org.jplus.util.ObjectHelper.isNotEmpty(result));
    } catch (java.sql.SQLException ex) {
        org.junit.Assert.fail("testShowAll faild.");
        ex.printStackTrace();
    }
}