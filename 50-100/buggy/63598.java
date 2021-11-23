public synchronized void update(ch.bfh.bti7081.s2016.blue.hv.entities.DrugOrderItem drugOrderItem, int quantity) {
    if (quantity >= 0) {
        ch.bfh.bti7081.s2016.blue.hv.entities.DrugOrderItem item = null;
        for (ch.bfh.bti7081.s2016.blue.hv.entities.DrugOrderItem i : items) {
            if (i.getName().equals(drugOrderItem.getName())) {
                if (quantity != 0) {
                    i.setQuantity(quantity);
                }else {
                    item = i;
                    break;
                }
            }
        }
        if (item != null) {
            items.remove(item);
        }
    }else {
    }
}