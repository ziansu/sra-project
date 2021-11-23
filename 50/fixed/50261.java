protected void setId(java.lang.Integer id) throws exception.ServiceItemException {
    boolean courseIdIsValid = (id != null) && (id > 0);
    if (courseIdIsValid) {
        this.id = id;
    }else {
        throw new exception.ServiceItemException(model.ServiceItem.ID_MUST_BE_GREATER_THAN_ZERO);
    }
}