public java.util.ArrayList<java.lang.String> getOrigins() {
    java.util.ArrayList<java.lang.String> origns = new java.util.ArrayList<java.lang.String>();
    for (Logic.Journey j : journeys) {
        if (origns.contains(j.getOrigin())) {
            origns.add(j.getOrigin());
        }
    }
    return origns;
}