@org.testng.annotations.Test
public void testAddUnit() throws java.lang.Exception {
    com.team7.objects.Tile t = new com.team7.objects.Tile();
    com.team7.objects.Player p = new com.team7.objects.Player();
    com.team7.objects.Army a = new com.team7.objects.Army(t, p);
    com.team7.objects.unit.combatUnit.MeleeUnit u = new com.team7.objects.unit.combatUnit.MeleeUnit(t, p);
    a.addUnitToArmy(u);
    int armySize = a.getUnits().size();
    assertEquals(armySize, 1);
}