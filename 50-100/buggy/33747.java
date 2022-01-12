public static java.lang.String processPrint(java.lang.String[] input) {
    if ((input.length) != 1) {
        java.lang.System.out.println("Invalid Input");
        return "";
    }
    java.util.Collections.sort(Assignment3.A3Driver.shoppingCart);
    for (int i = 0; i < (Assignment3.A3Driver.shoppingCart.size()); i++) {
        Assignment3.A3Driver.shoppingCart.get(i).printItemAttributes();
    }
    return "";
}