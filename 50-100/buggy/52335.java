private void buildHistoryNewItem(java.lang.String pageKey, java.lang.String itemId) {
    java.lang.String token = com.google.gwt.user.client.History.getToken();
    java.lang.String destinationPage = (("moduleKey=" + (org.broadleafcommerce.openadmin.client.view.MasterView.moduleKey)) + "&pageKey=") + pageKey;
    if (itemId != null) {
        destinationPage = (destinationPage + "&itemId=") + itemId;
    }else {
        if ((org.broadleafcommerce.openadmin.client.BLCLaunch.getDefaultItem(token)) != null) {
            destinationPage = (destinationPage + "&itemId=") + (org.broadleafcommerce.openadmin.client.BLCLaunch.getDefaultItem(token));
        }
    }
    com.google.gwt.user.client.History.newItem(destinationPage);
}