@org.junit.Test
public void testLargeExp() throws java.sql.SQLException {
    li.cryx.expcraft.DummyPlayer player = new li.cryx.expcraft.DummyPlayer("cryxli");
    li.cryx.expcraft.module.ExpCraftModule module = new li.cryx.expcraft.DummyModule("LargeExp", "Le");
    double exp = db.getExp(module, player);
    junit.framework.Assert.assertEquals(0, exp, 0);
    db.setExp(module, player, 1523.75);
    exp = db.getExp(module, player);
    junit.framework.Assert.assertEquals(1523.75, exp, 0);
}