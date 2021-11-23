@java.lang.Override
protected biweekly.property.RawProperty _parseXml(biweekly.io.xml.XCalElement element, biweekly.parameter.ICalParameters parameters, biweekly.io.ParseContext context) {
    biweekly.io.xml.XCalElement.XCalValue firstValue = element.firstValue();
    biweekly.ICalDataType dataType = firstValue.getDataType();
    java.lang.String value = firstValue.getValue();
    biweekly.property.RawProperty property = new biweekly.property.RawProperty(propertyName, value);
    property.setDataType(dataType);
    return property;
}