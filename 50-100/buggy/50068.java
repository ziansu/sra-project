protected void putMandatoryPasswordParameter(java.lang.String name, java.lang.String description, java.lang.String instructions, int order) throws com.sixsq.slipstream.exceptions.ValidationException {
    S parameter = createParameter(name, description, true);
    parameter.setCategory(getCategory());
    parameter.setOrder(order);
    parameter.setInstructions(instructions);
    addParameter(parameter, ParameterType.Password, true);
}