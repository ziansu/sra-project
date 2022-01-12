@org.junit.BeforeClass
public static void prepareTestClass() throws java.lang.Exception {
    setupIntegrationTestEnvironmentForTransactionalTests();
    eu.bittrade.libs.steemj.base.models.AccountName challengedAccount = new eu.bittrade.libs.steemj.base.models.AccountName("dez1337");
    eu.bittrade.libs.steemj.base.models.operations.ProveAuthorityOperation proveAuthorityOperationWithOwnerKey = new eu.bittrade.libs.steemj.base.models.operations.ProveAuthorityOperation(challengedAccount, true);
    eu.bittrade.libs.steemj.base.models.operations.ProveAuthorityOperation proveAuthorityOperationWithActiveKey = new eu.bittrade.libs.steemj.base.models.operations.ProveAuthorityOperation(challengedAccount);
    java.util.ArrayList<eu.bittrade.libs.steemj.base.models.operations.Operation> operations = new java.util.ArrayList<>();
    operations.add(proveAuthorityOperationWithActiveKey);
    operations.add(proveAuthorityOperationWithOwnerKey);
    signedTransaction.setOperations(operations);
    sign();
}