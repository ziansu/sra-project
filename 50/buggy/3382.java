@org.junit.Test
public void testAddArmorInventoryTestingArmorList() throws java.lang.Exception {
    org.mockito.Mockito.when(mockInventoryFactory.create()).thenReturn(mockInventory);
    testCreature.addItemToInventory(mockArmor, "armor");
    org.mockito.Mockito.verify(mockInventory).addItem(mockArmor, "armor");
}