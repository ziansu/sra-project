public static um.edu.mt.AccountDatabase initialise() {
    if ((um.edu.mt.AccountDatabase.instance) == null) {
        um.edu.mt.AccountDatabase.instance = new um.edu.mt.AccountDatabase();
    }
    return um.edu.mt.AccountDatabase.instance;
}