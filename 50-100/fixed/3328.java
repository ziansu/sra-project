public java.lang.String extractLastName(java.lang.String fullName) throws java.lang.IllegalArgumentException {
    java.lang.String lastName = null;
    if ((fullName == null) || (fullName.isEmpty())) {
        throw new java.lang.IllegalArgumentException();
    }
    java.lang.String[] parts = fullName.split(" ");
    if ((parts.length) < 2) {
        throw new java.lang.IllegalArgumentException();
    }
    lastName = parts[((parts.length) - 1)];
    return lastName;
}