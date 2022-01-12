private void setSurname(java.lang.String surname) {
    if (surname == null) {
        throw new java.lang.IllegalArgumentException(exceptions.data.ErrorMessageHelper.nullOrEmptyMessage("Surname"));
    }
    this.surname = surname;
}