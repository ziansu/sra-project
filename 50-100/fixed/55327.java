public void constructSubCategoryItemList(int cat_id, java.lang.String header) {
    java.util.ArrayList<demo.kolorob.kolorobdemoversion.model.SubCategoryItem> subCategoryItems;
    subCategoryItems = constructSubCategoryListItem(cat_id, header);
    java.util.ArrayList<java.lang.String> itemName = new java.util.ArrayList<java.lang.String>();
    currentSubCategoryItem = subCategoryItems;
    for (demo.kolorob.kolorobdemoversion.model.SubCategoryItem si : subCategoryItems) {
        itemName.add(si.getSubCatName());
    }
    int i = 0;
}