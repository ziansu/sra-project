public boolean addAtomicTransaction(mt.edu.um.b_d_app.AccountDatabase database, int src, int dst, int amount, java.lang.String name) {
    return this.transactionList.add(new mt.edu.um.b_d_app.AtomicTransaction(src, dst, amount, database, name));
}