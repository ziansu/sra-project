@java.lang.Override
public void onClick(android.view.View view) {
    new io.gloop.drawed.dialogs.SearchDialog(this, owner, mTwoPane, this.getSupportFragmentManager()).show();
    floatingActionMenu.close(false);
}