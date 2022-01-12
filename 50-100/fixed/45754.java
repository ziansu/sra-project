@java.lang.Override
public void onBackPressed() {
    if ((onModify) == true) {
        onModify = false;
        android.view.MenuItem discardItem = menu.findItem(R.id.action_discard);
        discardItem.setVisible(false);
        buildListView();
        return ;
    }else {
        super.onBackPressed();
    }
}