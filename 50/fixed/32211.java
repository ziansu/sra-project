@java.lang.Override
public void onClick(android.view.View view) {
    new io.gloop.drawed.dialogs.SearchDialog(this, floatingActionMenu, owner, mTwoPane, this.getSupportFragmentManager());
    floatingActionMenu.close(false);
}