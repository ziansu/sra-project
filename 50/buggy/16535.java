public double sendPrice(int fuelKind, android.content.Context context) {
    double price = 0;
    com.vp3000r.yourfuelconsumption.Model model = new com.vp3000r.yourfuelconsumption.Model(context);
    price = com.vp3000r.yourfuelconsumption.Model.sendFuelConsumption(fuelKind);
    return price;
}