public static void CityUI(finalProject.City newCity) {
    finalProject.UserInt.city = newCity;
    finalProject.UserInt.updateProductionList();
    finalProject.UserInt.visableCityUI(true);
    finalProject.UserInt.visableUnitUI(false);
    finalProject.UserInt.updateFood();
    finalProject.UserInt.updateGold();
    finalProject.UserInt.updateProduction();
    finalProject.UserInt.updateScience();
    finalProject.UserInt.cityName.setText(finalProject.UserInt.city.name);
}