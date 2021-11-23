public void setReturn(java.lang.Object returnObject) {
    io.kusanagi.katana.sdk.ServiceSchema serviceSchema = getServiceSchema(getName(), getVersion());
    io.kusanagi.katana.sdk.ActionSchema actionSchema = serviceSchema.getActionSchema(getActionName());
    if (actionSchema.hasReturn()) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(ExceptionMessage.CANNOT_SET_A_RETURN_VALUE, getName(), getVersion(), getActionName()));
    }
    validateReturnObjectType(actionSchema.getReturnType());
    this.returnObject = returnObject;
}