@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    this.mode = mode;
    mDbProvider = de.micmun.android.miwotreff.db.DBProvider.getInstance(mActivity);
    android.view.MenuInflater inflater = mode.getMenuInflater();
    inflater.inflate(R.menu.context_menu, menu);
    java.lang.String selMsg = java.lang.String.format(selMsgFormat, java.lang.String.valueOf(mId));
    mode.setTitle(selMsg);
    view.setSelected(true);
    return true;
}