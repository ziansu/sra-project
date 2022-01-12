@org.junit.Test
public void testTransactionBetweenUsers() {
    bank.depositAccount(bank.getClientByName("Carlos"), 5000);
    bank.transfer(bank.getClientByName("Carlos"), bank.getClientByName("Melo"), 3000);
    assertEquals(3000, bank.getClientByName("Melo").getAccount());
}