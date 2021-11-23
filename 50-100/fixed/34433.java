@java.lang.Override
protected void populateViewHolder(com.aparnyuk.rsn.adapter.NoteListAdapter.NoteViewHolder noteViewHolder, com.aparnyuk.rsn.model.Note note, int i) {
    if (note != null) {
        noteViewHolder.noteText.setText(note.getText());
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("dd.MM.yyyy, HH:mm");
        noteViewHolder.dateText.setText(dateFormat.format(note.getDate()));
        if (com.aparnyuk.rsn.adapter.NoteListAdapter.deleteItemSet.contains(noteViewHolder.getLayoutPosition())) {
            noteViewHolder.ll.setBackgroundColor(Color.LTGRAY);
        }else {
            noteViewHolder.ll.setBackgroundColor(Color.WHITE);
        }
    }
}