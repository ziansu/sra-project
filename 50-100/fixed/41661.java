private java.lang.String prepareMessage(com.flightreservationbot.resource.skyscanner.SkyscannerCommonResource flightsFound) {
    java.util.List<com.flightreservationbot.resource.skyscanner.QuotesClass> allQuotes = flightsFound.getQuotes();
    java.lang.String message = new java.lang.String();
    message = allQuotes.get(0).toString();
    if ((message.length()) == 0) {
        message = "Uzgunum, herhangi bir ucus bulamadim.";
    }
    return message;
}