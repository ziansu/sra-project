@org.greenrobot.eventbus.Subscribe
public void onNoteUpdate(com.kikyo.note.service.NoteService.NoteUpdateContentEvent event) {
    int pos = mNotes.indexOf(event.note);
    mNoteService.updateNote(event.note);
    mNoteList.getAdapter().notifyItemChanged(pos);
}