@java.lang.Override
public java.util.Map toMap() {
    java.util.Map map = super.getMap(com.smartbt.vtsuite.boundary.client.LastTransactionsResponse.EXPECTED_RESULT_CODE);
    if ((transactionsList) != null) {
        return transactionsList.toMap();
    }
    return null;
}