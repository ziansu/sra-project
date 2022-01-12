public java.lang.String extractLastName(java.lang.String fullName) throws java.lang.IllegalArgumentException {
    java.lang.String lastName = null;
    if ((fullName == null) || (fullName.isEmpty())) {
        throw new java.lang.IllegalArgumentException("Full name is mandatory. Please enter full name in format First Last (e.g. John Smith)");
    }
    java.lang.String[] parts = fullName.split(" ");
    if ((parts.length) < 2) {
        throw new java.lang.IllegalArgumentException("Full name must have first name and last name separated by a space");
    }
    lastName = parts[((parts.length) - 1)];
    return lastName;
}