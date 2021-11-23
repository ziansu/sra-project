@org.junit.Test
public void testTransactionBetweenUsers() {
    bank.depositAccount(bank.getClientByName("Carlos"), 5000);
    bank.transfer(3000, bank.getClientByName("Carlos"), bank.getClientByName("Melo"));
    assertEquals(3000, bank.getClientByName("Melo").getAccount());
}