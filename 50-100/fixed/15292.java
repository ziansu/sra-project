@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.delete :
            com.zettig.tracker.Utils.ManagerAlertDialog.showDialog(getActivity(), R.string.question_delete_character, R.string.yes, R.string.no, onDelete, onDismisDelete);
            break;
    }
    return super.onOptionsItemSelected(item);
}