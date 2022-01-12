public java.util.HashMap<byte[], main.generic.Transaction> addTransaction(main.generic.Transaction trans) {
    byte[] transHash = null;
    main.generic.Transaction tra = trans;
    try {
        transHash = main.generic.Hasher.hash(trans);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    transactions.put(transHash, tra);
    (transactionCount)++;
    return transactions;
}