private void setLongPressListener(android.view.View v, android.view.View popup) {
    v.setOnLongClickListener(new android.view.View.OnLongClickListener() {
        @java.lang.Override
        public boolean onLongClick(android.view.View v) {
            if ((v.getParent()) instanceof com.ameron32.apps.tapnotes.v2.ui.mc_notes.NotesRecycler) {
                com.ameron32.apps.tapnotes.v2.ui.mc_notes.NotesRecycler nr = ((com.ameron32.apps.tapnotes.v2.ui.mc_notes.NotesRecycler) (v.getParent()));
                nr.itemClicked(v);
                popup.setVisibility(View.VISIBLE);
                return true;
            }
            return false;
        }
    });
}