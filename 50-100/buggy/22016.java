@org.junit.Test
public void deleteAcccountTest() {
    Wasserman.Zachary.Project2ATM.AccountManager accManager = new Wasserman.Zachary.Project2ATM.AccountManager();
    Wasserman.Zachary.Project2ATM.Account acc1 = new Wasserman.Zachary.Project2ATM.Account("bob", 0.0);
    Wasserman.Zachary.Project2ATM.Account acc2 = new Wasserman.Zachary.Project2ATM.Account("fred", 0.0);
    accManager.accountList.add(acc1);
    accManager.accountList.add(acc2);
    accManager.deleteAccount(acc1);
    int expected = 1;
    int actual = accManager.accountList.size();
    assertEquals("Account list should have a size of 1", expected, actual);
}