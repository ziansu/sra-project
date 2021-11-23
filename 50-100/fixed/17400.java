public void setOrderTotal() {
    int count = 0;
    java.util.List<businessObjects.domain.OrderDetails> entries = businessObjects.SessionInformations.getInstance().getEntry();
    for (businessObjects.domain.OrderDetails orderDetails : entries) {
        count = count + (orderDetails.getQuantity());
    }
    if (count > 0)
        menuItem.setIcon(buildCounterDrawable(count));
    
}