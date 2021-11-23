@org.junit.Test
public void return_coins_inserted() {
    org.junit.Assert.assertEquals("INSERT COINS", vendingMachine.check_display());
    vendingMachine.insert_coin("Dime");
    org.junit.Assert.assertEquals("$0.10", vendingMachine.check_display());
    vendingMachine.return_coins();
    org.junit.Assert.assertEquals("$0.00", vendingMachine.check_coin_return());
}