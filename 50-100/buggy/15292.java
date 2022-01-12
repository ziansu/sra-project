@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.delete :
            com.zettig.tracker.Utils.ManagerAlertDialog.showDialog(getActivity(), R.string.question_delete_character, R.string.yes, R.string.no, onDelete, onDismisDelete);
            break;
        case R.id.done :
            if ((character) == null) {
                addNewCharacter();
            }else {
                editCharacter();
            }
            break;
    }
    return super.onOptionsItemSelected(item);
}