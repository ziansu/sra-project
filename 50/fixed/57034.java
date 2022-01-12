@java.lang.Override
protected bg.o.sim.finansizmus.model.User doInBackground(bg.o.sim.finansizmus.model.User... params) {
    long id = params[0].getId();
    loadUserAccounts(id);
    loadUserCategories(id);
    loadUserTransactions(id);
    return params[0];
}