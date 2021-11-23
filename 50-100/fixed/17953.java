public void initialize() {
    javafx.beans.property.StringProperty speedProperty = new javafx.beans.property.SimpleStringProperty("0,0");
    speedLabel.textProperty().bind(speedProperty);
    javafx.beans.property.StringProperty fuelConsumedProperty = new javafx.beans.property.SimpleStringProperty("0,0");
    fuelConsumedLabel.textProperty().bind(fuelConsumedProperty);
    javafx.beans.property.StringProperty totalDistanceProperty = new javafx.beans.property.SimpleStringProperty("0,0");
    totalDistanceDrivenLabel.textProperty().bind(totalDistanceProperty);
    trips.Trip trip = new trips.Trip(speedProperty, fuelConsumedProperty, totalDistanceProperty);
    trip.startLoop("src/metrics/TestData/data3.json", CarActionsFilter.vehicle_speed, CarActionsFilter.fuel_consumed_since_restart, CarActionsFilter.odometer);
}