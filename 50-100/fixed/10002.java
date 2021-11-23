public static java.lang.String PaymentAuth(long cardAmount, int cash, int TotalPay) {
    java.util.Scanner ms = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Payment Option: Cash or Card?");
    java.lang.String option = ms.next();
    if (option == "Cash") {
        if (cash == TotalPay) {
            return "Success! Payment has been authorized";
        }else {
            return "Payment fail! Please check amount";
        }
    }else
        if (option == "Card") {
            if (cardAmount == TotalPay) {
                return "Success! Payment has been authorized";
            }else {
                return "Payment fail! Please check card or amount";
            }
        }
    
    return null;
}