public void recalculateTotal() {
    double total = 0.0;
    java.util.Iterator it = itemPool.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        total += ((com.iankeefer.model.items.Item) (pair.getValue())).getPrice().getValue();
        it.remove();
    } 
    this.total = total;
}