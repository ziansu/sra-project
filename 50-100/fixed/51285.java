@java.lang.Override
void trigger() {
    java.lang.String population = data.CsvParser.populations[ui.UserInterface.askStrings("Choose the sampling population: ", CsvParser.populations)];
    java.lang.String features = data.CsvParser.features[ui.UserInterface.askStrings("Choose a feature: ", CsvParser.features)];
    java.lang.String country = ui.UserInterface.askString("Choose the country: ").toLowerCase();
    java.lang.String year = ui.UserInterface.askString("Choose a year: ");
    java.lang.Number result = data.DataManager.singleton().get(population, features, country, year);
    if (result != null)
        java.lang.System.out.println(result);
    else
        java.lang.System.err.println("Data not available!");
    
}