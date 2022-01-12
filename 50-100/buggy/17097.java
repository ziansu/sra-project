private void applyAndAnimateRemovals(java.util.ArrayList<com.yeahdev.yeahurls.model.NoteItem> newModels) {
    for (int i = (getItemCount()) - 1; i >= 0; i--) {
        final com.yeahdev.yeahurls.model.NoteItem model = this.noteItemCollection.get(i);
        if (!(newModels.contains(model))) {
            this.removeFilterItem(i);
        }
    }
}