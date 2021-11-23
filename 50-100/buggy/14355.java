@java.lang.Override
public cs3500.music.model.INote makeNoteFromLocation(int x, int y, int length) {
    cs3500.music.adapters.Note note = this.guiMusicView.getNoteFromPosition(x, y);
    cs3500.music.model.INote note1 = note.getNote();
    note1.setDuration((length / 20));
    return note1;
}