public void addList(java.lang.String itemName) {
    content.add(itemName);
    java.util.Collections.sort(content);
    setNoContent();
    com.randomappsinc.studentpicker.Misc.PreferencesManager.get().addNameList(itemName);
    notifyDataSetChanged();
}