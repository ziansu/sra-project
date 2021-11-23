@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mUmsatz = args.getParcelable(de.aw.monma.wertpapier.UMSATZ);
    setIsSwipeable(true);
    java.lang.String accountName = getString(R.string.tvPaketeAlleDepots);
    long accountID = args.getInt(de.aw.monma.wertpapier.ACCOUNTID, de.aw.monma.wertpapier.NOID);
    if (accountID != (NOID)) {
        accountName = de.aw.monma.gv.Account.getAccountName(args.getInt(de.aw.monma.wertpapier.ACCOUNTID));
    }
    setTitle(accountName);
}