private java.util.List<de.grau.organizer.classes.Notes> filterNotes() {
    java.util.List<de.grau.organizer.classes.Notes> retNotes = new java.util.ArrayList<de.grau.organizer.classes.Notes>();
    for (android.widget.EditText et_note : layout_notelist) {
        if (et_note.getText().toString().trim().isEmpty())
            continue;
        
        de.grau.organizer.classes.Notes curNote = new de.grau.organizer.classes.Notes();
        curNote.setText(et_note.getText().toString());
        retNotes.add(curNote);
    }
    return retNotes;
}