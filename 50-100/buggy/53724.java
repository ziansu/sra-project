private void setOrderToShow(se.chalmers.ait.dat215.project.Order order) {
    currentItem = new iMat.shop.centerview.purchasehistory.purchasehistoryitem.PurchaseHistoryOrder(order);
    currentItem.setHeight(((int) (orderItemPane.getHeight())));
    currentItem.setWidth(((int) (orderItemPane.getWidth())));
    orderItemPane.getChildren().clear();
    orderItemPane.getChildren().add(currentItem);
    tipLabel.setVisible(false);
}