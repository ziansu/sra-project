public void notifyAllSectionsDataSetChanged() {
    buildSectionIndex();
    notifyDataSetChanged();
}