private void setNoteInfo(java.lang.String header, java.lang.String text, int priority) {
    tvHeader.setText(header);
    tvText.setText(text);
    if (com.dmitry.smartnotes.fragments.DetailNoteFragment.ACTION_VIEW.equals(currentState.getAction())) {
        tvPriority.setText(com.dmitry.smartnotes.entity.Note.getPriorities()[priority]);
    }else {
        spPriority.setSelection(priority);
    }
}