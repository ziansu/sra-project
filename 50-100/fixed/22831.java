public void recalculateTotal() {
    double total = 0.0;
    java.util.Iterator it = itemPool.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        for (com.iankeefer.model.items.Item item : ((java.util.ArrayList<com.iankeefer.model.items.Item>) (pair.getValue()))) {
            total += item.getPrice().getValue();
        }
    } 
    this.total = total;
}