@java.lang.Override
public boolean doesNoteExist(cs3500.music.view2.Playable note, int beat) {
    return !((this.m.getNote(note.getPitch(), beat)) == null);
}