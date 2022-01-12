@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_about)) {
        new android.support.v7.app.AlertDialog.Builder(this).setCancelable(true).setView(R.layout.about_dialog).create().show();
        return true;
    }
    if (id == (R.id.action_show_tips)) {
        showTipsSequence(100, true);
        return true;
    }
    return super.onOptionsItemSelected(item);
}