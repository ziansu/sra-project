public <Any> Any castValue(java.lang.String value) throws io.frictionlessdata.tableschema.exceptions.ConstraintsException, io.frictionlessdata.tableschema.exceptions.InvalidCastException {
    return this.castValue(value, false);
}