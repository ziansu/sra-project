public void setLastName(java.lang.String lastName) throws java.lang.IllegalArgumentException {
    if ((((lastName.length()) < (lab0.Employee.MIN_NAME_LENGTH)) || ((lastName.length()) > (lab0.Employee.MAX_NAME_LENGTH))) || (lastName == null)) {
        throw new java.lang.IllegalArgumentException("Sorry the entered name length is invalid");
    }
    this.lastName = lastName;
}