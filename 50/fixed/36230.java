public static void prepareMap(javafx.scene.layout.Pane stack) {
    controllers.Map.generateMilitaryAirports(10, stack);
    controllers.Map.generateHarbors(10, stack);
    controllers.Map.generateCivilAirports(10, stack);
}