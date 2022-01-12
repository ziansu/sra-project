@org.junit.Test
public void testGetWeaponRatios_machineGun() {
    org.lisoft.lsml.model.item.Weapon mg = ((org.lisoft.lsml.model.item.Weapon) (org.lisoft.lsml.model.datacache.ItemDB.lookup("MACHINE GUN")));
    items.add(mg);
    when(heatDissipation.calculate()).thenReturn(0.0);
    java.util.Map<org.lisoft.lsml.model.item.Weapon, java.lang.Double> result_0 = cut.getWeaponRatios((-1));
    org.junit.Assert.assertTrue(result_0.containsKey(mg));
    org.junit.Assert.assertEquals(0.0, result_0.get(mg).doubleValue(), 0.0);
}