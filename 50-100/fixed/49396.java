protected void putMandatoryParameter(java.lang.String name, java.lang.String description, com.sixsq.slipstream.persistence.ParameterType type, java.lang.String instructions) throws com.sixsq.slipstream.exceptions.ValidationException {
    S parameter = createParameter(name, null, description, true);
    parameter.setType(type);
    parameter.setInstructions(instructions);
    assignParameter(parameter);
}