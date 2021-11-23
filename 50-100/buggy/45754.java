@java.lang.Override
public void onBackPressed() {
    if ((onModify) == true) {
        onModify = false;
        android.view.MenuItem discardItem = menu.findItem(R.id.action_discard);
        discardItem.setVisible(false);
        android.view.MenuItem newItem = menu.findItem(R.id.action_new);
        newItem.setVisible(true);
        buildListView();
        return ;
    }else {
        super.onBackPressed();
    }
}