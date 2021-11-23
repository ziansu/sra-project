private java.lang.String adjustLabel(java.lang.String label, org.transmart.rest.objects.ObservationValue value) {
    if (!(value.getType().equals(ObservationValueType.STRING)))
        return label;
    
    if ((value.printableValue().length()) == 1)
        return label;
    
    java.lang.String valueString = value.printableValue();
    if (label.contains(valueString)) {
        int pos = label.indexOf(valueString);
        label = label.substring(0, pos);
    }
    return label;
}