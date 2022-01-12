@org.junit.Test
public void VendingMachineRejectsPenny() {
    assertEquals("Please insert a valid coin", vendingMachine.insert("penny", 1));
}