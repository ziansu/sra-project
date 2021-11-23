private static void issueStatementHandler(int sequenceNumber) throws java.io.IOException, java.lang.InterruptedException, org.keybase.InsufficientMoneyException {
    if ((ext.hasRootOfTrustTxid()) == false) {
        org.keybase.NotaryApp.issueRootOfTrustHandler();
        return ;
    }else {
        org.keybase.NotaryApp.log.debug("Already have root-of-trust txid '{}'", ext.getRootOfTrustTxid());
    }
    java.lang.String stmt;
    try {
        stmt = org.keybase.JSONParser.getMerkleRoot(sequenceNumber);
    } catch (java.lang.Exception e) {
        stmt = "";
        java.lang.System.exit(1);
    }
    java.lang.System.out.println(stmt);
    org.keybase.NotaryApp.issueStatement(stmt);
}