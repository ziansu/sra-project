@org.junit.BeforeClass
public static void prepareTestClass() throws java.lang.Exception {
    setupIntegrationTestEnvironmentForTransactionalTests();
    eu.bittrade.libs.steemj.base.models.AccountName accountToRecover = new eu.bittrade.libs.steemj.base.models.AccountName("steemj");
    eu.bittrade.libs.steemj.base.models.AccountName newRecoveryAccount = new eu.bittrade.libs.steemj.base.models.AccountName("dez1337");
    eu.bittrade.libs.steemj.base.models.operations.ChangeRecoveryAccountOperation changeRecoveryAccountOperation = new eu.bittrade.libs.steemj.base.models.operations.ChangeRecoveryAccountOperation(accountToRecover, newRecoveryAccount);
    java.util.ArrayList<eu.bittrade.libs.steemj.base.models.operations.Operation> operations = new java.util.ArrayList<>();
    operations.add(changeRecoveryAccountOperation);
    signedTransaction.setOperations(operations);
    sign();
}