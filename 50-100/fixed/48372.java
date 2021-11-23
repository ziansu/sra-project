private static void testGetArchive(int account_id) throws ibm.resource.DatabaseException {
    java.util.ArrayList<ibm.resource.Transaction> array = ibm.db.DB.getArchive(account_id);
    for (ibm.resource.Transaction t : array) {
        java.lang.System.out.println((((((t.getAccountId()) + " ") + (t.getAmount())) + " ") + (t.getDescription())));
    }
}