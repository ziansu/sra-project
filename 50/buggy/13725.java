public void removeMyNoteView(android.view.ViewGroup parent) {
    boolean isMynoteTextEdit = isMyNoteViewShowing(parent);
    parent.setTag("");
    if (isMynoteTextEdit) {
        parent.removeView(myNoteText);
        mainActivity.unregisterForContextMenu(myNoteText);
    }
}