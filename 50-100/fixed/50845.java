protected void putEnumParameter(java.lang.String name, java.lang.String description, java.util.List<java.lang.String> options, java.lang.String value, boolean mandatory, int order) throws com.sixsq.slipstream.exceptions.ValidationException {
    S parameter = createParameter(name, description, mandatory);
    parameter.setEnumValues(options);
    parameter.setValue(value);
    parameter.setOrder(order);
    addParameter(parameter, ParameterType.Enum, mandatory);
}