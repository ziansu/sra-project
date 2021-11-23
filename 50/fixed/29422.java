private static double getCurrent(java.util.HashMap<java.lang.String, java.lang.Integer> customer, java.lang.String cmd) {
    double fee = PriceCalc.getFee(customer, cmd);
    return fee;
}