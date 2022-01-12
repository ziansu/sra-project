private void buildHistoryNewItem(java.lang.String pageKey, java.lang.String itemId) {
    java.lang.String destinationPage = (("moduleKey=" + (org.broadleafcommerce.openadmin.client.view.MasterView.moduleKey)) + "&pageKey=") + pageKey;
    if (itemId != null) {
        destinationPage = (destinationPage + "&itemId=") + itemId;
    }
    com.google.gwt.user.client.History.newItem(destinationPage);
}