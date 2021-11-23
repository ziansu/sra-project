public java.lang.String calculate(int[] amountOfCubes) {
    if (amountOfCubes == null)
        return "";
    
    return new aero.geoscan.aquarium.AquariumModel().calculateWater(amountOfCubes);
}