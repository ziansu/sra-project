private void populateListItems() {
    listItems = new java.util.ArrayList<>();
    if ((articles) != null) {
        for (com.rocdev.guardianreader.models.Article article : articles) {
            listItems.add(article);
        }
    }
    if (hasMoreButton) {
        android.view.View buttonView = inflater.inflate(R.layout.more_button_list_item, null);
        listItems.add(buttonView);
    }
    addNativeExpressAds();
}