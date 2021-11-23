@org.springframework.web.bind.annotation.RequestMapping(value = "/getDestinationSearchResults", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.TreeSet<com.springframework.model.Destination> getDestinationSearchResults(@org.springframework.web.bind.annotation.RequestParam(value = "search")
java.lang.String search) {
    java.util.TreeSet<com.springframework.model.Destination> destinations = new java.util.TreeSet<>(( d1, d2) -> d1.getDateAndTimeToString().compareTo(d2.getDateAndTimeToString()));
    for (com.springframework.model.Destination destination : com.springframework.functionality.DestinationsManager.getInstance().getAllDestinations().values()) {
        if (destination.getName().toLowerCase().contains(search.toLowerCase())) {
            destinations.add(destination);
        }
    }
    return destinations;
}