@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String selectedNoteTitle = mNoteNames.get(((int) (id))).toString();
    nl.yoerinijs.notebuddy.files.TextfileReader t = new nl.yoerinijs.notebuddy.files.TextfileReader();
    java.lang.String note = t.getText(mLocation, selectedNoteTitle, mPassword, mContext);
    startActvitiy(nl.yoerinijs.notebuddy.activities.NotesActivity.EDIT_NOTE_ACTIVITY, true, note, selectedNoteTitle);
}