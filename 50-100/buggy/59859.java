private boolean matchesNameFilter(com.mfranklin.fridgeapp.data_model.FoodItem item) {
    android.util.Log.d("FoodItemAdapter", "filtering on name");
    if (((nameFilter) == null) || ((nameFilter.length()) == 0))
        return true;
    
    java.lang.String[] nameWords = item.type.name.split("\\s+");
    for (java.lang.String nameWord : nameWords)
        if (nameWord.toLowerCase().startsWith(nameFilter.toLowerCase()))
            return true;
        
    
    return false;
}