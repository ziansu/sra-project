@org.junit.Test
public void testGetWeaponRatios_ppc() {
    org.lisoft.lsml.model.item.Weapon ppc = ((org.lisoft.lsml.model.item.Weapon) (org.lisoft.lsml.model.datacache.ItemDB.lookup("PPC")));
    items.add(ppc);
    when(heatDissipation.calculate()).thenReturn(10.0);
    org.junit.Assert.assertEquals(ppc.getStat("d/s", null), cut.calculate((90.0 + 0.001)), 0.0);
    org.junit.Assert.assertEquals(0.0, cut.calculate((90.0 - 0.001)), 0.0);
}