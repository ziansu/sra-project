public static void main(java.lang.String[] args) {
    java.lang.String productName = stringInput("What is the name of the product?");
    double price = doubleInput((("What does " + productName) + " cost?"));
    int quantity = intInput((("How many " + productName) + " to sell?"));
    double totalPrice = price + quantity;
    java.lang.System.out.println(((((((quantity + " of ") + productName) + " at $") + price) + "each costs $") + totalPrice));
}