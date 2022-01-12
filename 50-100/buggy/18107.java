public void addLocations(javax.xml.stream.XMLStreamWriter xml, java.lang.String designation, java.util.Set<java.lang.String> coordinates) throws javax.xml.stream.XMLStreamException {
    (assignedLocations)++;
    write(xml, designationField, designation);
    write(xml, combinedField, ((designation + (dk.statsbiblioteket.summa.support.doms.LocationMatcher.COMBINED_DELIMITER)) + coordinates));
    for (java.lang.String coordinate : coordinates) {
        write(xml, coordinatesField, coordinate);
    }
}