public void showCart() {
    smallProductViews.removeAll(smallProductViews);
    for (imat.viewcontroller.Product p : cart.keySet()) {
        imat.viewcontroller.SmallProductViewController smallProductViewController = imat.viewcontroller.SmallProductViewController.load("SmallProductView.fxml");
        smallProductViewController.setItem(new imat.viewcontroller.ShoppingItem(p, cart.get(p)), true, false);
        smallProductViews.add(smallProductViewController.getView());
    }
    listView.setItems(smallProductViews);
}