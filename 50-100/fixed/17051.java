private void toggleSection(int pos) {
    if (listView.isItemChecked(pos)) {
        listView.setItemChecked(pos, false);
        selectedItems.remove(pos);
        if (selectedItems.isEmpty())
            actionMode.finish();
        
    }else {
        listView.setItemChecked(pos, true);
        selectedItems.put(pos, true);
    }
}