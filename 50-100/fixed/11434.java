public boolean equals(java.lang.Object o) {
    if (!(o instanceof simfinder.FieldValue)) {
        return false;
    }
    if (!(header.equals(((simfinder.FieldValue) (o)).getHeader()))) {
        return false;
    }
    if (!(value.equals(((simfinder.FieldValue) (o)).getValue()))) {
        return false;
    }
    return true;
}