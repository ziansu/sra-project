@java.lang.Override
public java.lang.String getMusicEditorState() {
    java.lang.String state = "";
    int lengthToPadNotes = java.lang.String.valueOf(song.getLength()).length();
    state += getEditorStateNoteRow(lengthToPadNotes);
    for (int i = 0; i <= (song.getLength()); i++) {
        state += java.lang.String.format((("%1$" + (java.lang.String.valueOf(lengthToPadNotes))) + "d"), i);
        state += (song.beatRowNotesToString(i)) + "\n";
    }
    return state;
}