@org.junit.Test
public void not_enough_inserted_for_chips() {
    org.junit.Assert.assertEquals("INSERT COINS", vendingMachine.check_display());
    vendingMachine.insert_coin("Quarter");
    org.junit.Assert.assertEquals("$0.25", vendingMachine.check_display());
    org.junit.Assert.assertEquals("$0.00", vendingMachine.check_coin_return());
    org.junit.Assert.assertEquals("PRICE $0.50", vendingMachine.select_product("Chips"));
    org.junit.Assert.assertEquals("$0.00", vendingMachine.check_coin_return());
    org.junit.Assert.assertEquals("$0.25", vendingMachine.check_display());
}