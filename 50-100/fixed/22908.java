public void onClick(android.content.DialogInterface dlg, int item) {
    org.eehouse.android.xw4.GamesListDelegate self = curThis();
    junit.framework.Assert.assertTrue(((-1) != (selItem[0])));
    long gid = self.m_adapter.getGroupIDFor(selItem[0]);
    for (long rowid : self.m_rowids) {
        org.eehouse.android.xw4.DBUtils.moveGame(self.m_activity, rowid, gid);
    }
    self.mkListAdapter();
}