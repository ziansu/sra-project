private void initSingleNoteWithImages(final com.example.webprog26.guitarchords.chord_shapes.note.Note note) {
    if ((note.getNoteMainDrawable()) != null) {
        android.widget.ImageView stringImageView = getStringImageView(getFretLayout(note.getNotePlace()), com.example.webprog26.guitarchords.guitar_chords_engine.helpers.FretViewsHelper.NOTE_IMAGE_VIEW_INDEX);
        stringImageView.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
        stringImageView.requestLayout();
        stringImageView.setImageDrawable(note.getNoteMainDrawable());
        stringImageView.bringToFront();
        stringImageView.setOnClickListener(new com.example.webprog26.guitarchords.guitar_chords_engine.listeners.NoteClickListener(note));
    }
}