public void notifyAllSectionsDataSetChanged() {
    if ((sections) == null) {
        buildSectionIndex();
    }
    notifyDataSetChanged();
}