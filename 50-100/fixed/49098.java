@java.lang.Override
public void onClick(android.view.View v) {
    if (!(((getSubject()) == null) || ((getContent()) == null))) {
        receivedNote.setSubject(getSubject());
        receivedNote.setContent(getContent());
        editNoteFragmentListener.saveChanges(receivedNote);
    }
}