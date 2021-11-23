private void sendToGoogle(java.lang.String[] input, java.lang.String textValues) {
    java.util.List<com.google.api.services.qpxExpress.model.TripOption> tripResults = flc.googleCommunicate(input);
    textValues = net.raphaelmiller.UIInterface.displayValues(tripResults, flc.tripData, flc.aircraftData, flc.carrierData, flc.airportData);
}