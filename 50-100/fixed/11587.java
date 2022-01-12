public java.util.ArrayList pendingBids() {
    java.util.ArrayList<com.ismailmare.warondemand.WarItem> itemsBeingBidOn = new java.util.ArrayList<>();
    for (int i = 0; i < (inventory.size()); i++) {
        if ((inventory.get(i).getStatus()) == 1) {
            itemsBeingBidOn.add(inventory.get(i));
        }
    }
    return itemsBeingBidOn;
}