public void refreshList() {
    this.content.clear();
    this.content.addAll(com.randomappsinc.studentpicker.Misc.PreferencesManager.get().getNameLists());
    setNoContent();
    notifyDataSetChanged();
}