public static void addFuelReserve(GasStation station, java.util.Scanner in) {
    int fuelReserve = station.getFuelReserve();
    int maxCapacity = station.getMaxFuelCapacity();
    java.lang.System.out.println(((("Gas station currently has " + fuelReserve) + " Liters and can store ") + maxCapacity));
    java.lang.System.out.println("How much would you like to add?");
    int fuel = ((int) (in.nextInt()));
    if (fuel <= (maxCapacity - fuelReserve)) {
        station.addFuel(fuel);
    }
}