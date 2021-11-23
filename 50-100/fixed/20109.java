@java.lang.Override
public void setup() {
    lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.DBHandler dbHandler = lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.DBHandler.getInstance(context);
    lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PresistentAccountDAO presistentAccountDAO = new lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PresistentAccountDAO(dbHandler);
    setAccountsDAO(presistentAccountDAO);
    lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PresistentTransactionDAO presistentTransactionDAO = new lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PresistentTransactionDAO(dbHandler);
    setTransactionsDAO(presistentTransactionDAO);
    getAccountsDAO().addAccount(new lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account("12345A", "Yoda Bank", "Anakin Skywalker", 10000.0));
    getAccountsDAO().addAccount(new lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account("78945Z", "Clone BC", "Obi-Wan Kenobi", 80000.0));
}