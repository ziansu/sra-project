public void showOrders(se.chalmers.ait.dat215.project.Order order) {
    smallHistoryProductViews.removeAll(smallHistoryProductViews);
    for (se.chalmers.ait.dat215.project.ShoppingItem shopItem : order.getItems()) {
        imat.viewcontroller.SmallProductViewController smallHistoryProductViewController = imat.viewcontroller.SmallProductViewController.load("SmallProductView.fxml");
        smallHistoryProductViewController.setItem(shopItem, false, true);
        smallHistoryProductViews.add(smallHistoryProductViewController.getView());
    }
    listView.setItems(smallHistoryProductViews);
}