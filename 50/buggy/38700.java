public java.util.List<com.aooci.ordercat.domain.Item> getItems() {
    if ((this.selectedItemCategory) != null)
        return this.dataService.loadItemsByItemCategoryId(this.selectedItemCategory.getId());
    else
        return this.dataService.loadItemsByItemCategoryId(SystemParameter.DEFAULT_ITEM_CATEGORY_ID);
    
}