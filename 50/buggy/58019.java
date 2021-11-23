public java.util.List<java.lang.String> getDefinedPlacesIds() {
    java.util.List<java.lang.String> places_strings = new java.util.ArrayList<>();
    for (es.inf.tu.dresden.de.predictor.helpers.Place place : this.defined_places)
        places_strings.add(java.lang.Integer.toString(place.getId()));
    
    return places_strings;
}