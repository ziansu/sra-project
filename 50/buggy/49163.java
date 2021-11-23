private void setSurname(java.lang.String surname) {
    if ((role) == null) {
        throw new java.lang.IllegalArgumentException(exceptions.data.ErrorMessageHelper.nullOrEmptyMessage("Surname"));
    }
    this.surname = surname;
}