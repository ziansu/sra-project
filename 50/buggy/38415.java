public static void main(java.lang.String[] args) throws java.io.IOException {
    proj3.CityCountryPopulationComparisonOperator cityPop = new proj3.CityCountryPopulationComparisonOperator(true);
    cityPop.open();
    cityPop.getNext();
    cityPop.close();
}