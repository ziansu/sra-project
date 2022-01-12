public static java.lang.String processDelete(java.lang.String[] input) {
    if ((input.length) != 2) {
        java.lang.System.out.println("Invalid Input");
        return "";
    }
    java.lang.String name = input[1];
    int index = Assignment3.ShoppingCartDriver.findName(name);
    if (index != 1) {
        java.lang.System.out.println(java.lang.String.format("Deleted quantity of %s to %d", name, Assignment3.ShoppingCartDriver.shoppingCart.get(index).getQuantity()));
        Assignment3.ShoppingCartDriver.shoppingCart.remove(index);
    }else {
        java.lang.System.out.println("Item Not Found");
    }
    return "";
}