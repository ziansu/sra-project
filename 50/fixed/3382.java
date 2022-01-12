@org.junit.Test
public void testAddArmorInventoryTestingArmorList() throws java.lang.Exception {
    testCreature.addItemToInventory(mockArmor, "armor");
    org.mockito.Mockito.verify(mockInventory).add(mockArmor, "armor");
}