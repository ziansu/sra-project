double calculateSubtotal() {
    for (int i = 0; i < (purchases.size()); i++) {
        subtotal += purchases.get(i).getTotal();
    }
    java.lang.System.out.println(("Subtotal: " + (subtotal)));
    return subtotal;
}