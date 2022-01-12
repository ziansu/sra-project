java.io.ObjectStreamField[] getFields() {
    if ((deserializedClass) != null) {
        deserializedClass.getFields();
    }
    if ((osci) != null) {
        return osci.fields;
    }
    if ((localClass) != null) {
        return localClass.getFields();
    }
    return empty;
}