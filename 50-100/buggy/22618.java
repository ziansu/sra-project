@org.junit.Test
public void testUpdatePassword() throws java.lang.Exception {
    org.jbei.ice.lib.account.model.Account account = org.jbei.ice.lib.AccountCreator.createTestAccount("testUpdatePassword", false);
    org.jbei.ice.lib.account.AccountTransfer transfer = account.toDataTransferObject();
    transfer.setPassword("p455W0rd");
    controller.updatePassword(account.getEmail(), transfer);
}