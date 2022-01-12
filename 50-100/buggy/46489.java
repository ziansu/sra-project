@org.junit.Test
public void testCalculate_ams() {
    org.lisoft.lsml.model.item.Weapon gauss = ((org.lisoft.lsml.model.item.Weapon) (org.lisoft.lsml.model.datacache.ItemDB.lookup("GAUSS RIFLE")));
    items.add(gauss);
    items.add(ItemDB.AMS);
    org.mockito.Mockito.when(heatDissipation.calculate()).thenReturn(1.0);
    double result = cut.calculate(0.0);
    org.junit.Assert.assertEquals(gauss.getStat("d/s", null), result, 0.0);
}