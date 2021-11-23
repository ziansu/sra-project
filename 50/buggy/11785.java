public void addItem(roy.myclear.database.Category category) {
    OnFocusRequested(0, "");
    mCategories.add(0, category);
    notifyDataSetChanged();
}