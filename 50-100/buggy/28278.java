public static void main(java.lang.String[] args) {
    eu.tkupek.zoomanager.util.XMLParser parser = new eu.tkupek.zoomanager.util.XMLParser();
    java.util.ArrayList<eu.tkupek.zoomanager.model.Animal> animals = parser.getAnimals();
    eu.tkupek.zoomanager.util.DatabaseConnection dbConn = new eu.tkupek.zoomanager.util.DatabaseConnection();
    dbConn.initializeDatabase();
    dbConn.writeMultipleAnimalsToDatabase(animals);
    dbConn.getAllAnimalsFromDatabase();
}