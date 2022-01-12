public void setDescription(final java.lang.String description) {
    if ((description == null) || (description.isEmpty())) {
        throw new java.lang.IllegalArgumentException("Description cannot be blank!");
    }
    this.myDescription = description;
}