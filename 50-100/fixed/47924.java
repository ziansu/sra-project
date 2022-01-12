public static com.kaloer.pourmaster.fields.FieldData createFromData(java.io.DataInput input, com.kaloer.pourmaster.FieldInfoStore fieldInfoStore) throws java.io.IOException {
    int fieldId = input.readUnsignedShort();
    com.kaloer.pourmaster.fields.Field f = fieldInfoStore.getFieldById(fieldId);
    com.kaloer.pourmaster.fields.FieldData fieldData = new com.kaloer.pourmaster.fields.FieldData();
    fieldData.setField(f);
    if (f.isStored()) {
        fieldData.setValue(f.getFieldType().readFromInput(input));
    }
    return fieldData;
}