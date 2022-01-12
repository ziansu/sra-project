public static void main(java.lang.String[] args) {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    do {
        java.lang.System.out.println("Enter the name of the product");
        java.lang.String productDescription = input.nextLine();
        java.lang.System.out.println("Enter the price of the product");
        double productPrice = input.nextDouble();
        java.lang.System.out.println("Enter the quantity that you're buying");
        int quantity = input.nextInt();
        input.nextLine();
        java.lang.String receiptLine = java.lang.String.format("%s $%.2f %d", productDescription, productPrice, quantity);
        java.lang.System.out.println(receiptLine);
    } while (true );
}