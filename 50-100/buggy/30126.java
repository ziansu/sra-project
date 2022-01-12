@org.junit.Test
public void testTransactionListSerializationAndDeserialization() {
    java.util.ArrayList<cryptocoinutil.Transaction> transactions = new java.util.ArrayList<cryptocoinutil.Transaction>();
    for (int i = 0; i < 100; i++) {
        transactions.add(cryptocoinutil.Transaction.getTestTransaction());
    }
    byte[] serializedList = cryptocoinutil.Transaction.serializeList(transactions);
    java.util.ArrayList<cryptocoinutil.Transaction> deserializedTransactions = cryptocoinutil.Transaction.deserializeList(serializedList, transactions.size());
    if (!(transactions.equals(deserializedTransactions))) {
        fail("Transaction list serialization does not work!");
    }
}