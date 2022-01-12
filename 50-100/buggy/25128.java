@org.junit.Test
public void sold_out_no_money_inserted() {
    vendingMachine.stock_products(0, 1, 1);
    org.junit.Assert.assertEquals("INSERT COINS", vendingMachine.check_display());
    org.junit.Assert.assertEquals("SOLD OUT", vendingMachine.select_product("Cola"));
    org.junit.Assert.assertEquals("$0.00", vendingMachine.check_display());
}