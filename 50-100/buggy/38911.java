public <T extends com.chicken.invasion.iItem> void getSavedAvailability(java.util.List<T> itemList) {
    for (int i = 0; i < (itemList.size()); i++) {
        boolean temp = prefs.getBoolean(itemList.get(i).getName(), false);
        itemList.get(i).setPurchased(temp);
    }
    itemList.get(0).setPurchased(true);
}