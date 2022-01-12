private static void removeCity(int index) {
    City[] copy = new City[(Shop.cities.length) - 1];
    for (int i = 0; i < index; i++) {
        copy[i] = Shop.cities[i];
    }
    for (int i = index + 1; i < (Shop.cities.length); i++) {
        copy[(i - 1)] = Shop.cities[i];
    }
    Shop.cities = copy;
}