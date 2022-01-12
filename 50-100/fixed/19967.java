public static void initialise(com.sillysoft.lux.Country[] countries, int numberOfContinents) {
    com.mld46.oponn.MapStats.numberOfCountries = countries.length;
    com.mld46.oponn.MapStats.numberOfContinents = numberOfContinents;
    com.mld46.oponn.MapStats.initialiseContinentLists(countries);
    com.mld46.oponn.MapStats.initialiseNodes(countries);
    com.mld46.oponn.MapStats.initialiseCompulsoryReinforcementMoves(countries);
    com.mld46.oponn.MapStats.initialiseValidReinforcementMoves(countries);
}