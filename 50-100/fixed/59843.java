public void setOrderTotal() {
    int count = 0;
    java.util.List<businessObjects.domain.OrderDetails> entries = businessObjects.SessionInformations.getInstance().getEntry();
    if ((menuItem) != null)
        menuItem.setIcon(buildCounterDrawable(entries.size()));
    
}