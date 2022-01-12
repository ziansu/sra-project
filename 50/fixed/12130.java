@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String newNote = input.getText().toString();
    adapter.append(newNote);
    me.shreyasr.quicknote.notepad.NotepadUtils.setCurrentNote(newNote);
    me.shreyasr.quicknote.notepad.NotepadUtils.updateNotepad();
}