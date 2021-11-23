protected boolean contains(java.lang.String field, java.lang.String value) {
    if (field == null) {
        return false;
    }
    return (field.trim().toLowerCase().indexOf(value)) != (-1);
}