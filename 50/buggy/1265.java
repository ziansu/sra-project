private void setName(java.lang.String name) {
    if ((role) == null) {
        throw new java.lang.IllegalArgumentException(exceptions.data.ErrorMessageHelper.nullOrEmptyMessage("First Name"));
    }
    this.name = name;
}