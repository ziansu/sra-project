public java.util.List<com.aooci.ordercat.domain.Item> getItems() {
    return this.dataService.loadItemsByItemCategoryId(this.selectedItemCategory.getId());
}