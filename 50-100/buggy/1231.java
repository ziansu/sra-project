public java.lang.String lineageString() {
    java.lang.StringBuilder lineageString = new java.lang.StringBuilder();
    java.util.Iterator<com.ontotext.ehri.georecon.place.Place> lineage = lineage().descendingIterator();
    while (lineage.hasNext()) {
        lineageString.append(com.ontotext.ehri.georecon.place.Place.LINEAGE_SEPARATOR);
        lineageString.append(lineage.next().toString());
    } 
    return lineageString.substring(com.ontotext.ehri.georecon.place.Place.LINEAGE_SEPARATOR.length());
}