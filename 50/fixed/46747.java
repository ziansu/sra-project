private java.lang.String sendToGoogle(java.lang.String[] input) {
    java.util.List<com.google.api.services.qpxExpress.model.TripOption> tripResults = flc.googleCommunicate(input);
    java.lang.String textValues = net.raphaelmiller.UIInterface.displayValues(tripResults, flc.tripData, flc.aircraftData, flc.carrierData, flc.airportData);
    return textValues;
}