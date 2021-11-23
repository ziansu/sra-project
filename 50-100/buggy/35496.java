private xmlmc.ComplexParam parseAdditionalCallValues() throws javax.xml.parsers.ParserConfigurationException {
    xmlmc.ComplexParam callValues = new xmlmc.ComplexParam("additionalCallValues");
    for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> tables : additonalCallValues.entrySet()) {
        xmlmc.ComplexParam table = callValues.createChild(tables.getKey());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> columns : tables.getValue().entrySet()) {
            table.addParameter(columns.getKey(), columns.getValue());
        }
    }
    return callValues;
}