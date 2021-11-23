public static double getFee(java.util.HashMap<java.lang.String, java.lang.Integer> customer, java.lang.String cmd) {
    int etime = PriceCalc.getTime();
    int duration = etime - (customer.get(cmd.substring(0, cmd.indexOf(".")).toLowerCase()));
    double fee = 0.0;
    fee = fee + (duration * 0.25);
    return fee;
}