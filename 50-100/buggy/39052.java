@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    android.view.View fragRootView = getView();
    savedInstanceState.putString(iluxonchik.github.io.markitdown.EditNoteFragment.NOTE_TITLE, noteTitle.getText().toString());
    savedInstanceState.putString(iluxonchik.github.io.markitdown.EditNoteFragment.NOTE_CONTENT, noteContent.getText().toString());
}