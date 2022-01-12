protected void searchItemsWihoutLicense() {
    final de.mpg.imeji.logic.item.ItemService controller = new de.mpg.imeji.logic.item.ItemService();
    itemsWithoutLicense = controller.search(collection.getId(), de.mpg.imeji.logic.search.model.SearchQuery.toSearchQuery(new de.mpg.imeji.logic.search.model.SearchPair(de.mpg.imeji.logic.search.model.SearchFields.license, de.mpg.imeji.logic.search.model.SearchOperators.EQUALS, de.mpg.imeji.logic.vo.ImejiLicenses.NO_LICENSE, false)), null, user, 0, 0).getNumberOfRecords();
}