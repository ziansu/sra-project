@org.junit.Test
public void emptyLanePlusOne() {
    ejercicios.elementum.vending.VendingMachineImpl vendingMachine = createVendingMachineWithStock();
    for (int i = 0; i < 11; i++) {
        vendingMachine.selectItem(1);
        vendingMachine.insertMoney(new java.math.BigDecimal(1));
        vendingMachine.submit();
    }
    org.junit.Assert.assertTrue(((vendingMachine.itemsAtLane(1)) == 0));
}