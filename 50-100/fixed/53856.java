public simfinder.FieldValue[] getBlankFields() {
    simfinder.FieldValue[] a = new simfinder.FieldValue[fields.length];
    for (int i = 0; i < (a.length); i++) {
        a[i] = new simfinder.FieldValue(fields[i]);
    }
    return a;
}