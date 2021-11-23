public void addList(java.lang.String itemName) {
    content.add(itemName);
    setNoContent();
    com.randomappsinc.studentpicker.Misc.PreferencesManager.get().addNameList(itemName);
    notifyDataSetChanged();
}