@java.lang.Override
protected void upgradeDatabaseFormatVersion12345WithoutCommit() {
    checkedActivate(1);
    if ((mInsertURIString) != null) {
        assert (mInsertURI) == null;
        return ;
    }
    assert (mInsertURI) != null;
    checkedActivate(mInsertURI, 2);
    mInsertURIString = mInsertURI.toString();
    mDB.delete(mInsertURI);
    mInsertURI = null;
    super.upgradeDatabaseFormatVersion12345WithoutCommit();
}