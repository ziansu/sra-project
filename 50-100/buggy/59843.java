public void setOrderTotal() {
    int count = 0;
    java.util.List<businessObjects.domain.OrderDetails> entries = businessObjects.SessionInformations.getInstance().getEntry();
    if ((entries.size()) > 0)
        menuItem.setIcon(buildCounterDrawable(entries.size()));
    
}