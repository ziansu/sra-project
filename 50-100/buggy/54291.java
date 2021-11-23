public void findWaitListWithProduct(Product product) {
    java.util.Iterator iterate = waitlistItems.iterator();
    while (iterate.hasNext()) {
        OrderLineItem object = ((OrderLineItem) (iterate.next()));
        if (object.product.equals(product)) {
            java.lang.System.out.println(((((("Order " + (id)) + " is waiting for ") + (object.quantity)) + ": ") + (product.getName())));
        }
    } 
}