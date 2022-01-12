@org.junit.Test(expected = java.lang.NullPointerException.class)
public void test_NullPeriodicTransactionEndDateTransaction() {
    model.PeriodicTransaction periodTransaction = new model.PeriodicTransaction(null, 1254, "HEBDOMADAIRE");
}