@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    menu.findItem(R.id.action_category).setVisible(false);
    menu.findItem(R.id.action_cart).setVisible(false);
    menu.findItem(R.id.action_call).setVisible(false);
    menu.findItem(R.id.action_search).setVisible(false);
    menu.findItem(R.id.loc).setVisible(false);
    super.onPrepareOptionsMenu(menu);
}