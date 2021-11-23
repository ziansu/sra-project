public void creditPay() {
    com.Shanklish.POSGroupProject.Pay.finalTotals();
    java.lang.System.out.println("Enter your card number: ");
    input = scan.nextLine();
    setCardNumber(input);
    java.lang.System.out.println("Enter expiration date (MM/YY)");
    input2 = scan.nextLine();
    setExpiration(input2);
    java.lang.System.out.println("Enter the CVV: ");
    input3 = scan.nextLine();
    setExpiration(input3);
    java.lang.System.out.println(((("This card " + (getCardNumber())) + " has been charged ") + (grandTotal)));
}