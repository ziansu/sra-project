public java.util.HashMap<java.lang.String, main.generic.Transaction> addTransaction(main.generic.Transaction trans) {
    byte[] transHash = null;
    main.generic.Transaction tra = trans;
    try {
        transHash = main.generic.Hasher.hash(trans);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    java.lang.String str = new java.lang.String(transHash);
    transactions.put(str, tra);
    (transactionCount)++;
    return transactions;
}