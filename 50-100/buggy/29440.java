private void applyAndAnimateAdditions(java.util.ArrayList<com.yeahdev.yeahurls.model.NoteItem> newModels) {
    for (int i = 0, count = newModels.size(); i < count; i++) {
        final com.yeahdev.yeahurls.model.NoteItem model = newModels.get(i);
        if (!(this.noteItemCollection.contains(model))) {
            this.addFilterItem(i, model);
        }
    }
}