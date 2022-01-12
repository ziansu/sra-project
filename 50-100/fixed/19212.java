@java.lang.Override
protected biweekly.property.RawProperty _parseXml(biweekly.io.xml.XCalElement element, biweekly.parameter.ICalParameters parameters, biweekly.io.ParseContext context) {
    biweekly.io.xml.XCalElement.XCalValue firstValue = element.firstValue();
    biweekly.ICalDataType dataType = firstValue.getDataType();
    java.lang.String value = firstValue.getValue();
    return new biweekly.property.RawProperty(propertyName, dataType, value);
}