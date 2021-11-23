public void addCityToPath(int city) {
    citiesNotVisited.remove(java.lang.Integer.valueOf(city));
    path[currPathIndex] = city;
    (currPathIndex)++;
}