public void add(int itemNumber) {
    if ((itemNumber > ((inventory.size()) - 1)) || (itemNumber < 0)) {
        java.lang.System.out.println("INVALID INDEX...Try Again");
    }else {
        items.add(inventory.get(itemNumber));
        java.lang.System.out.println(((inventory.get(itemNumber).getName()) + " was added to cart!"));
        subTotal += items.get(((items.size()) - 1)).getPrice();
    }
}