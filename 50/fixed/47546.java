public static org.bbt.kiakoa.model.LoanLists getInstance() {
    if ((org.bbt.kiakoa.model.LoanLists.instance) == null) {
        android.util.Log.i(org.bbt.kiakoa.model.LoanLists.TAG, "getInstance: Creating instance");
        org.bbt.kiakoa.model.LoanLists.instance = new org.bbt.kiakoa.model.LoanLists();
    }
    return org.bbt.kiakoa.model.LoanLists.instance;
}